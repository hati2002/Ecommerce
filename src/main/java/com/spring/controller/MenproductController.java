package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.ProductService;
import com.spring.user.Product;

@Controller
public class MenproductController {

	@Autowired
	private ProductService ps;
	
	@RequestMapping("/menproduct")
	public String showmenproduct(Model model) {
		
		List<Product> list=ps.catchp();
		model.addAttribute("GetProduct",list);
		return "menproduct";
	}
	
	
}
