package com.covalense.emp.controller;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/form")
public class FormController {

	@GetMapping("/getform")
	public String getForm() {
		return "MyForm";
	}// End of getform()

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		int id =Integer.parseInt(req.getParameter("id"));
		String pswd = req.getParameter("password");
		req.setAttribute("userId",id);
		req.setAttribute("password",pswd);
		
		return "formDataDisplay";
		
	}// End of submitForm1()
	
	@PostMapping("/submit2")
	public String submitForm2(int userId , String password , ModelMap modelMap) {
		
		modelMap.addAttribute("id", userId);
		modelMap.addAttribute("password", password);
		
		return "formDataDisplay";
		
	}// End of submitForm2()
	@PostMapping("/submit3")
	public String submitForm3(UserBean bean, ModelMap modelMap) {
		modelMap.addAttribute("userbean",bean);
		return "formDataBeanDisplay";
	}// End of submitForm3()
	
	@PostMapping("/submit4")
	public String submitForm4(@RequestParam(name = "userId") int uId, @RequestParam(name = "password") String pswd, ModelMap modelMap) {
		modelMap.addAttribute("userId",uId);
		modelMap.addAttribute("password",pswd);
		return "formDataDisplay";
	}// End of submitForm4()
	
	@PostMapping("/submit5")
	public String submitForm5(@RequestParam(name = "userId") int uId, @RequestParam(name = "password") String pswd, ModelMap modelMap) {
		modelMap.addAttribute("userId",uId);
		modelMap.addAttribute("password",pswd);
		return "formDataDisplayEL";
	}// End of submitForm5()
	
	@PostMapping("/submit6")
	public String submitForm6(UserBean bean, ModelMap modelMap) {
		modelMap.addAttribute("userbean",bean);
		return "formDataBeanDisplayEL";
	}// End of submitForm6()
}// End of class
