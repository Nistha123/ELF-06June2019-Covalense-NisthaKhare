package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
@PropertySource("classpath:emp.properties")
public class SessionController {
	
	@GetMapping("/validate1")
	public String validatesession1(HttpServletRequest req , ModelMap map,@RequestParam String url) {
		if(req.getSession(false) == null) {
			map.addAttribute("msg","invalid session...Please Login again!!!");
			return "LoginForm";
		}
		return url;
	}// End of validatesession1()
	
	@GetMapping("/validate2")
	public String validatesession2(HttpSession session, ModelMap map,@RequestParam("url") String url,@Value("${msg}") String msg) {
		if(session.isNew()) {
			map.addAttribute("msg",msg);
			session.invalidate();
			return "LoginForm";
		}
		return "forward:/session/"+url;
	}// End of validatesession2()
	
	@PostMapping("/validate2")
	public String validateSessionPost(HttpSession session, ModelMap map,@RequestParam String url,@Value("${msg}") String msg) {
		
		return validatesession2(session, map, url,msg);
	}// End of validateSessionPost()
	
	@GetMapping("/validate3/{url}")
	public String validatesession3(HttpSession session, ModelMap map , @Value("${msg}") String msg,
			@PathVariable("url") String url) {
		if(session.isNew()) {
			map.addAttribute("msg",msg);
			session.invalidate();
			return "LoginForm";
		}
		return "forward:/session/"+url;
	}// End of validatesession3()

	
	@GetMapping("/getregform")
	public String getRegisterForm() {
		return "RegisterOneToOne";
	}// End of getform()
	
	@PostMapping("/register")
	public String createEmployee(EmployeeInfoBean bean,ModelMap map,@Value("${getFactory}")String getFactory) {
		EmployeeDao dao = EmployeeDaoFactory.getInstance(getFactory);

		boolean saveData = dao.createEmployee(bean);	
		map.addAttribute("msg", "Employee Registered Successfully");
		map.addAttribute("empBean", bean);
		
		return "Login";
	}
	@GetMapping("/login")
	public String getLogin() {

		return "LoginForm";
	}// End of getLogin()

	@PostMapping("/login")
	public String authenticateUser(int userId, String password, HttpServletRequest req,@Value("${getFactory}")String getFactory) {
		EmployeeDao dao = EmployeeDaoFactory.getInstance(getFactory);
		EmployeeInfoBean bean = dao.getEmployeeInfo(userId);
		req.setAttribute("empBean", bean);
		if (bean == null) {
			req.setAttribute("msg", "Invalid credentials!!!");
			return "LoginFail";
		} else {
			if (!password.equals(bean.getPassword())) {
				req.setAttribute("msg", "Invalid credentials!!!");
				return "LoginFail";
			} else {
				HttpSession session = req.getSession(true);
				return "userHome";
			}
		}

	}// End of authenticateUser()
	
	@GetMapping("/empSearch")
	public String searchEmployee(String id,ModelMap map) {
		
		map.addAttribute("empid", id);
		
		return "EmployeeSearch";	
	}// End of searchEmployee()
	
	/*
	 * @GetMapping("/get") public String getEmployee(String id,ModelMap map) {
	 * map.addAttribute("empid", id);
	 * 
	 * return "ShowEmployee";
	 * 
	 * }// End of getEmployee()
	 */	
	
	@GetMapping("/getemp")
	public String getHome(@RequestParam String id,ModelMap map,@Value("${getFactory}")String getFactory) {
		EmployeeDao dao = EmployeeDaoFactory.getInstance(getFactory);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		map.addAttribute("empBean", bean);
		return "userHome";
	}// End of getHome()
	
	@GetMapping("/logout")
	public String logoutForm(HttpSession session,ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logout Successfull !!!");
		return "LoginForm";
	}// End of logoutForm()
	
}// End of controller
