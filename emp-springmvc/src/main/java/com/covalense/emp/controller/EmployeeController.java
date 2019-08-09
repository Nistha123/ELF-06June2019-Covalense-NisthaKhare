package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static com.covalense.emp.common.EMPConstants.*;
import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dao.EmployeeDaoFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.emp.manytoone.EmployeeAddressInfoBean;
import com.covalense.emp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.emp.manytoone.EmployeeExperienceInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier(DB_INTERACTION)
	private EmployeeDao dao;
	
	@InitBinder
	public void init(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/getregform")
	public String getRegisterForm() {
		return "Register";
	}
	
	@GetMapping("/search")
	public String employeeSearch(String empid, ModelMap map) {
		List<EmployeeInfoBean> bean = dao.searchLikeEmployee(empid);
		map.addAttribute("empbean", bean);
		return "EmployeeSearch";

	}//End of employeeSearch()

	@PostMapping("/register")
	public String createEmployee(EmployeeInfoBean bean,ModelMap map,int managerId) {
		//EmployeeDao dao = EmployeeDaoFactory.getInstance(getFactory);
		
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
		
		boolean result = dao.createEmployee(bean);
		
		bean = dao.getEmployeeInfo(managerId);
		bean.setMngId(bean);
		
		if(result) {
			map.addAttribute("msg", "Employee Registered Successfully");
			map.addAttribute("empBean", bean);
		}else {
			map.addAttribute("msg", "Employee insertion Failed");
		}
		return "LoginPage";
		
	}//End of createEmployee()
	
	@GetMapping("/updateemployee")
	public String getUpdateEmployee() {
		
		return "UpdateEmployee";
	}//End of getUpdateEmployee()
	
	@PostMapping("/updateemployee")
	public String updateEmployee(EmployeeInfoBean bean , int managerTd , HttpSession httpSession) {
		
		EmployeeInfoBean mngId = dao.getEmployeeInfo(managerTd);
		bean.setMngId(mngId);
		dao.updateEmployeeInfo(bean);
		httpSession.setAttribute("empBean", bean);
		return "userHome";
		
	}//End of updateEmployee()
	
}
