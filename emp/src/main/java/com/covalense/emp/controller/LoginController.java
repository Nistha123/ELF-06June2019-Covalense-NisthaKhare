package com.covalense.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
@Controller
@RequestMapping("/employeeform")
public class LoginController {
	

	@GetMapping("/getform")
	public String getForm() {
		return "Login";
	}// End of getform()
	
	
	@PostMapping("/login")
	public String authenticateEmployee(int id , String password, ModelMap modelMap) {
		
		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		modelMap.addAttribute("empBean",bean);
		//ModelMap ps = modelMap.addAttribute("password",password);
		String msg = "Invalid Credentials";
		if(bean==null) {
			modelMap.addAttribute(msg);
			return "LoginFail";
		}else {
			if(!password.equals(bean.getPassword())) {
				modelMap.addAttribute(msg);
				return "LoginFail";
			}else {
				return "ShowEmployee";
			}
		}
		
	}// End of authenticateEmployee()

}//End of class
