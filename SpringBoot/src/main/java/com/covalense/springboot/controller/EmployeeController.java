package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World !!!";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getOtherInfo().setInfobean(bean);

		for (EmployeeAddressInfoBean addressInfoBean : bean.getLstAddressInfoBean()) {
			addressInfoBean.getAddresspKBean().setInfoBean(bean);
		}

		for (EmployeeEducationalInfoBean educationInfoBean: bean.getLstEducationalInfo()) {
			educationInfoBean.getPkBean().setInfoBean(bean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getLstExperienceInfo()) {
			experienceInfoBean.getExpPKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getMngId();
		
		if(manager!=null) {
			manager = repository.findById(manager.getId()).get();
			bean.setMngId(manager);
		}

		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			repository.save(bean);
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

	@PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getOtherInfo().setInfobean(bean);

		for (EmployeeAddressInfoBean addressInfoBean : bean.getLstAddressInfoBean()) {
			addressInfoBean.getAddresspKBean().setInfoBean(bean);
		}

		for (EmployeeEducationalInfoBean educationInfoBean: bean.getLstEducationalInfo()) {
			educationInfoBean.getPkBean().setInfoBean(bean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getLstExperienceInfo()) {
			experienceInfoBean.getExpPKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getMngId();
		
		if(manager!=null) {
			manager = repository.findById(manager.getId()).get();
			bean.setMngId(manager);
		}
		
		EmployeeResponse response = new EmployeeResponse();
		
		if (repository.existsById(bean.getId())) {
			bean.getOtherInfo().setOtherInfoId(repository.findByID(bean).getOtherInfoId());
			
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data update failure");
		}

		return response;
	}// end of updateEmployee

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id) {
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data found successfully");
			response.setLstInfoBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data not found");
		}

		return response;
	}// end of getEmployee

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			repository.deleteById(id);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data deleted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data deleted failed");
		}

		return response;
	}// end of deleteEmployee
	
	@GetMapping(value = "/getOtherInfo" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean otherInfo(int id) {
		EmployeeInfoBean infoBean = new EmployeeInfoBean();
		infoBean.setId(id);
		return repository.findByID(infoBean);
	}


}
