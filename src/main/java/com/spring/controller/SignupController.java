package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignupController {

	@RequestMapping(path = "/signupform", method = RequestMethod.POST)
	public String viewsign() {
		
		return "login";
	}
}
