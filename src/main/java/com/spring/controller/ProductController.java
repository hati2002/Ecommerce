package com.spring.controller;

import java.util.List;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.ProductDao;
import com.spring.dao.WomenProductDao;
import com.spring.service.ProductService;
import com.spring.service.WomenProductService;
import com.spring.user.Product;
import com.spring.user.WomenProduct;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@Autowired
	private WomenProductService wps;

	@RequestMapping("/product")
	public String View() {

		return "product";
	}

	@RequestMapping("/productdetails/{id}")
	public String viewDetals(@PathVariable int id, Model m) {
		Product pdProduct = service.getProductById(id);
		m.addAttribute("getProduct", pdProduct);
		return "productdetails";
	}

	//for women
	@RequestMapping("/womenproduct")
	public String viewWomenDetails( Model m) {
		List<WomenProduct> wp = wps.getallProducts();
		m.addAttribute("getProduct", wp);
		return "womenproduct";
	}
	
	@RequestMapping(path = "/productform", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product,WomenProduct womenProduct) {

		System.out.println(product);
		
		if (product.getId()!=0) {

			int r = this.service.createUser(product);
			System.out.println(r);
			return "success";
		}
		
			int y=this.wps.createwomenproduct(womenProduct);
			System.out.println(y);
			
			return "success";
		
	}


}
