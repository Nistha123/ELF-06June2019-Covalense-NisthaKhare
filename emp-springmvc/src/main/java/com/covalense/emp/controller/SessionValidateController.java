package com.covalense.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.covalense.emp.common.EMPConstants.VIEW_LOGINFAIL;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {
	
	@GetMapping("/validate/{url1}/{url2}")
	public String validateSession(HttpSession session, ModelMap map,@Value("${msg}") String msg,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2) {
		if(session.isNew()) {
			map.addAttribute("msg",msg);
			session.invalidate();
			return VIEW_LOGINFAIL;
		}
		return "forward:/"+ url1+"/"+url2;
	}
	
	@PostMapping("/validate/{url1}/{url2}")
	public String postValidateSession(HttpSession session, ModelMap map,@Value("${msg}") String msg,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2) {
		return validateSession(session, map, msg,url1,url2);
	}

}
