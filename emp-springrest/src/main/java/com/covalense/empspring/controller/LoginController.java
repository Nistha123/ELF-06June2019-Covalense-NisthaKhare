package com.covalense.empspring.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspring.beans.EmployeeAddressInfoBean;
import com.covalense.empspring.beans.EmployeeEducationalInfoBean;
import com.covalense.empspring.beans.EmployeeExperienceInfoBean;
import com.covalense.empspring.beans.EmployeeInfoBean;
import com.covalense.empspring.beans.EmployeeOtherInfoBean;
import com.covalense.empspring.beans.EmployeeResponse;
import com.covalense.empspring.dao.EmployeeDao;

@RestController
@RequestMapping("/employeelogin")
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDao dao;

	@InitBinder
	public void init(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse authenticateEmp(int id, String password, HttpServletRequest request) {

		EmployeeInfoBean infoBean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if (infoBean != null && password.equals(infoBean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Successfully");
			response.setDescription("Loggedin successfully");
			response.setLstInfoBean(Arrays.asList(infoBean));
			request.getSession().setAttribute("bean", infoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Invalid Credentials");
		} // End of else-if

		return response;
	}// End of authenticateEmp()

	@GetMapping(path = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession httpSession) {
		httpSession.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Logged Out successfully");

		return response;

	}// End of logout()

	@GetMapping(path = "/readcookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionID) {
		EmployeeResponse response = new EmployeeResponse();

		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("JSESSIONID : " + sessionID);
		
		return response;
	}// End of readCookie()
}
