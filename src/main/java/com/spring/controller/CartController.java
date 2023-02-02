package com.spring.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.CartService;
import com.spring.service.ProductService;
import com.spring.user.Item;
import com.spring.user.Product;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ProductService productService;

	@RequestMapping("/buy/{productId}")
	public String showCart(@PathVariable int productId, Model m) {
		
		Item cartProduct = new Item();
		
		cartProduct.setProductId(productId);
		System.out.println(cartProduct);
		this.cartService.createproduct(cartProduct);
		List<Item> list = cartService.getcartproduct();
		Iterator<Item> itr = list.iterator();
		ArrayList<Product> pList = new ArrayList<Product>();
		while (itr.hasNext()) {
			Item cp = itr.next();
			int pId = cp.getProductId();
			Product product = productService.getProductById(pId);
			pList.add(product);
		}
		m.addAttribute("cart", pList);

		return "cart";
	}
}
