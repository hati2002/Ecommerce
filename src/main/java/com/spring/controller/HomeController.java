package com.spring.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.service.UserService;
import com.spring.user.User;

@Controller
public class HomeController {

	@Autowired
	private UserService us;

	@RequestMapping("/")
	public String viewhome() {
		
		return "index";
	}
	@RequestMapping("login")
	public String login() {

		return "login";
	}

	/*
	 * @RequestMapping(path = "/handleform",method = RequestMethod.POST) public
	 * String loginDetails(@ModelAttribute User user) {
	 * 
	 * System.out.println(user);
	 * 
	 * int r=this.us.createUser(user); System.out.println(r); return "success"; }
	 */

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String loginuser(@RequestParam("umail") String umail, @RequestParam("psw") String upassword) {

		List<User> list = us.getall();
		Iterator<User> itr = list.iterator();
		while (itr.hasNext()) {
			User user = itr.next();
			if (user.getUmail().equals(umail) && user.getPsw().equals(upassword)) {
				return "index";
			}
		}
		return "signup";
	}
}
