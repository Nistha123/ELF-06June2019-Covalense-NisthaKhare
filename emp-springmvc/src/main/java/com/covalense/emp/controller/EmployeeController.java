package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static com.covalense.emp.common.EMPConstants.*;
import com.covalense.emp.dao.EmployeeDao;
import com.covalense.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier(DB_INTERACTION)
	EmployeeDao dao;
	public void init(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/search")
	public String employeeSearch(String empid, ModelMap map) {
		List<EmployeeInfoBean> bean = dao.searchLikeEmployee(empid);
		map.addAttribute("empbean", bean);
		return "EmployeeSearch";

	}//End of employeeSearch()

}
