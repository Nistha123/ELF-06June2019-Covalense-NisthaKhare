package com.covalense.empspring.controller;

import static com.covalense.empspring.common.EMPConstants.DB_INTERACTION;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspring.beans.EmployeeAddressInfoBean;
import com.covalense.empspring.beans.EmployeeEducationalInfoBean;
import com.covalense.empspring.beans.EmployeeExperienceInfoBean;
import com.covalense.empspring.beans.EmployeeInfoBean;
import com.covalense.empspring.beans.EmployeeOtherInfoBean;
import com.covalense.empspring.beans.EmployeeResponse;
import com.covalense.empspring.dao.EmployeeDao;

@RestController
@RequestMapping("/employeerest")
public class EmployeeRestController {
	@Autowired
	@Qualifier(DB_INTERACTION)
	EmployeeDao dao;

	@InitBinder
	public void init(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);

	}// End of init()

	@DeleteMapping(path = "/removeEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@RequestParam("id") int id,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		
		if(request.getSession(false) != null) {
		if (dao.deleteEmployeeInfo(id)) {
			response.setStatusCode(201);
			response.setMessage("Successfully");
			response.setDescription("Employee deleted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee not deleted");
		}
	}else {
		response.setStatusCode(401);
		response.setMessage("Failure");
		response.setDescription("Please Login First");
	}
		return response;

	}// End of removeEmployee()

	@PostMapping(path = "/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response = new EmployeeResponse();

		List<EmployeeAddressInfoBean> lstAddressInfoBean = bean.getLstAddressInfoBean();
		for (EmployeeAddressInfoBean addressInfoBean : lstAddressInfoBean) {
			addressInfoBean.getAddresspKBean().setInfoBean(bean);

		}

		List<EmployeeExperienceInfoBean> lstExperienceInfo = bean.getLstExperienceInfo();
		for (EmployeeExperienceInfoBean experienceInfoBean : lstExperienceInfo) {
			experienceInfoBean.getExpPKBean().setInfoBean(bean);
		}

		List<EmployeeEducationalInfoBean> lstEducationalInfo = bean.getLstEducationalInfo();
		for (EmployeeEducationalInfoBean educationalInfoBean : lstEducationalInfo) {
			educationalInfoBean.getPkBean().setInfoBean(bean);
		}
		EmployeeOtherInfoBean otherInfoBean = bean.getOtherInfo();
		otherInfoBean.setInfobean(bean);

		if (dao.createEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Successfully");
			response.setDescription("Employee inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee not inserted successfully");
		}

		return response;

	}// End of createEmployee()

	@PutMapping(path = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeAddressInfoBean> lstAddressInfoBean = bean.getLstAddressInfoBean();
		for (EmployeeAddressInfoBean addressInfoBean : lstAddressInfoBean) {
			addressInfoBean.getAddresspKBean().setInfoBean(bean);

		}

		List<EmployeeExperienceInfoBean> lstExperienceInfo = bean.getLstExperienceInfo();
		for (EmployeeExperienceInfoBean experienceInfoBean : lstExperienceInfo) {
			experienceInfoBean.getExpPKBean().setInfoBean(bean);
		}

		List<EmployeeEducationalInfoBean> lstEducationalInfo = bean.getLstEducationalInfo();
		for (EmployeeEducationalInfoBean educationalInfoBean : lstEducationalInfo) {
			educationalInfoBean.getPkBean().setInfoBean(bean);
		}
		EmployeeOtherInfoBean otherInfoBean = bean.getOtherInfo();
		otherInfoBean.setInfobean(bean);
		
		if (request.getSession(false) != null) {
		if (dao.updateEmployeeInfo(bean)) {
			response.setStatusCode(201);
			response.setMessage("Successfully");
			response.setDescription("Employee updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee not updated");
		}
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Please Login First");
		}
		return response;

	}// End of updateEmployee()

	@GetMapping(path = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest request) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("Successfully");
				response.setDescription("Employee found successfully");
				response.setLstInfoBean(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee not found");
			}
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Please Login First");
		}

		return response;

	}// End of getEmployee()

	@GetMapping(path = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {
		List<EmployeeInfoBean> lstBean = dao.getAllEmployee();
		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {
			if (lstBean != null) {
				response.setStatusCode(201);
				response.setMessage("Successfully");
				response.setDescription("Employees found successfully");
				response.setLstInfoBean(lstBean);
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employees not found");
			}
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Please Login First");
		}
		return response;

	}// End of getAllEmployee()

}// End of controller
