package com.spring.controller;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.ProductService;
import com.spring.user.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@RequestMapping("/product")
	public String View() {
		
		return "product";
	}
	
	@RequestMapping(path = "/productform",method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product) {
		
		System.out.println(product);
		
		int r=this.service.createUser(product);
		System.out.println(r);
		
		return "success";
	}
}
