package com.covalense.springboot.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class LoginController {
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id,String password,HttpServletRequest httpServletRequest) {

		EmployeeInfoBean infoBean = repository.findById(id).get();
		
		EmployeeResponse response = new EmployeeResponse();
		
		if(infoBean != null && infoBean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data found successfully");
			response.setLstInfoBean(Arrays.asList(infoBean));
			httpServletRequest.getSession().setAttribute("bean",infoBean);
		}else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data found failure");
		}
		return response;
	}// end of login()
	
	@GetMapping(path = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession httpSession) {
		httpSession.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Logged Out successfully");

		return response;
		
	}// end of logout()

}
