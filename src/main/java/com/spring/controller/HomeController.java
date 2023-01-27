package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.UserService;
import com.spring.user.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(path = "/handleform",method = RequestMethod.POST)
	public String loginDetails(@ModelAttribute User user) {
		
		System.out.println(user);
		
		int r=this.us.createUser(user);
		System.out.println(r);
		return "success";
	}

	@RequestMapping("/menprod")
	public String show() {
		
		return "menproduct";
	}
}
