package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDao;
import com.spring.user.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public int createUser(Product product) {
		
		return this.productDao.saveUser(product);
	}
}
