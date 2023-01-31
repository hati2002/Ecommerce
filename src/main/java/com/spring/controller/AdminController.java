package com.spring.controller;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String show() {

		return "adminlogin";
	}

	
	  @RequestMapping(path = "/adminform",method = RequestMethod.POST)
	  public String showProductList(@RequestParam("amail") String admail,
			  @RequestParam ("psw") String apass) {
	 
	 if (admail.equals("suman.hati@gmail.com") && apass.equals("2000"))
	 {
		 return "product"; 
		 
		 }
	 
	  else {
		  return "adminlogin"; 
		  } 
	 }
	 

}
