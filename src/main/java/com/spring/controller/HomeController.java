package com.spring.controller;

import java.net.http.HttpRequest;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	private HttpServletRequest request;

	@Autowired
	private UserService us;

	@RequestMapping("/")
	public String viewhome() {

		return "index";
	}

	@RequestMapping("/login")
	public String login() {

		return "login";
	}

	@RequestMapping(path="/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "index";
	 }
	
	@RequestMapping("/home")
	public String viewHome() {
		return "index";
	}

	/*
	 * @RequestMapping(path = "/handleform",method = RequestMethod.POST) public
	 * String loginDetails(@ModelAttribute User user) {
	 * 
	 * System.out.println(user);
	 * 
	 * int r=this.us.createUser(user); System.out.println(r);
	 * 
	 * return "success"; }
	 */

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String loginuser(@RequestParam("umail") String umail, @RequestParam("psw") String upassword, Model m) {

		List<User> list = us.getall();
		Iterator<User> itr = list.iterator();

		while (itr.hasNext()) {
			User user = itr.next();
			if (user.getUmail().equals(umail) && user.getPsw().equals(upassword)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUname());
				return "index";
			}
		}
		return "signup";
	}

}
