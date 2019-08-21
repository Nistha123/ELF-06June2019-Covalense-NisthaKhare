package com.covalense.librarymanagementsystem.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.librarymanagementsystem.beans.LibraryResponse;
import com.covalense.librarymanagementsystem.beans.UserInfoBean;
import com.covalense.librarymanagementsystem.repository.UserRepository;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*")
public class LoginController {

	@Autowired
	UserRepository userRepository;

	@PostMapping(path = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse login(int id, String password, HttpServletRequest servletRequest) {

		UserInfoBean infoBean = userRepository.findById(id).get();

		LibraryResponse response = new LibraryResponse();

		if (infoBean != null && infoBean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data found successfully");
			response.setLstInfoBean(Arrays.asList(infoBean));
			HttpSession httpSession = servletRequest.getSession();
			httpSession.setAttribute("bean", infoBean);
			
		} else {
			response.setStatusCode(401);
			response.setDescription("employee data found failure");
		}
		return response;
	}// End of login()

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse createEmployee(@RequestBody UserInfoBean bean) {

		LibraryResponse response = new LibraryResponse();
		if (!userRepository.existsById(bean.getId())) {
			userRepository.save(bean);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data added failure");
		}

		return response;
	}// end of createEmployee

	@GetMapping(path = "/getalluser",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllUser(HttpServletRequest request) {

		LibraryResponse response = new LibraryResponse();
		List<UserInfoBean> lstuserBean = (List<UserInfoBean>) userRepository.findAll();
		List<UserInfoBean> lstBean = new ArrayList<UserInfoBean>();
		System.out.println("\n\n");
		if (request.getSession(false) != null) {
			for (UserInfoBean infoBean : lstuserBean) {
				System.out.println(infoBean.getName() + "\t" + infoBean.getUserType());
				if (infoBean.getUserType().equals("User")) {
					response.setStatusCode(201);
					response.setMessage("success");
					response.setDescription("employee data added successfully");
					lstBean.add(infoBean);
					
				}
			}
			response.setLstInfoBean(lstBean);

		}

		return response;
	}// end of getAllUser

}// End of controller
