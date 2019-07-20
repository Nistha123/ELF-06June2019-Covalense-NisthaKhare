package com.covalense.emp.controller;

import static com.covalense.emp.common.EMPConstants.PROPERTYFILE;
import static com.covalense.emp.common.EMPConstants.VIEW_HOMEPAGE;
import static com.covalense.emp.common.EMPConstants.VIEW_LOGINFAIL;
import static com.covalense.emp.common.EMPConstants.VIEW_LOGINPAGE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
@Controller
@RequestMapping("/login")
@PropertySource(PROPERTYFILE)
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDao dao;
	
	@GetMapping("/loginpage")
	public String getLogin() {

		return VIEW_LOGINPAGE;
	}// End of getLogin()
	
	  @PostMapping("/authenticate") 
	  public String authenticateEmp(int userId, String password, HttpServletRequest request,@Value("${errorMsg}")String errorMsg) {
		  
		  EmployeeInfoBean infoBean = dao.getEmployeeInfo(userId);
		  if(infoBean==null) {
			  request.setAttribute("errorMsg", errorMsg);
			  return VIEW_LOGINFAIL;
		  }else {
			  if(!password.equals(infoBean.getPassword())) {
				  request.setAttribute("errorMsg", errorMsg);
				  return VIEW_LOGINFAIL;
			  }else {
				  HttpSession httpSession = request.getSession(true);
				  httpSession.setAttribute("empBean", infoBean);
				  return VIEW_HOMEPAGE;
			  }
		  }// End of else-if
	  }// End of authenticateEmp()
	  
	 @GetMapping("/logout")
	  public String logout(HttpSession httpSession, ModelMap map, @Value("${thanksMsg}") String msg) {
		 httpSession.invalidate();
		 map.addAttribute("msg",msg);
		return VIEW_LOGINPAGE; 
		
	}
}
