package com.spring.controller;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.UserService;
import com.spring.user.User;

@Controller
public class SignupController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/signup")
	public String View() {
		
		return "signup";
	}
	
	
	@RequestMapping(path = "/signupform", method = RequestMethod.POST)
	public String viewsign(@ModelAttribute User user,Model model) {
		
		userservice.createUser(user);
		System.out.println(user);
		
		return "success";
	}
}
