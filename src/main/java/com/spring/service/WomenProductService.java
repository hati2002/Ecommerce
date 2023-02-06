package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.WomenProductDao;
import com.spring.user.Product;
import com.spring.user.WomenProduct;

@Service
public class WomenProductService {

	@Autowired
	private WomenProductDao womenProductDao;

	public int createwomenproduct(WomenProduct womenProduct) {

		return this.womenProductDao.saveproduct(womenProduct);
	}

	
	public List<WomenProduct> getallProducts() {

		return this.womenProductDao.getallProducts();
	}

	public WomenProduct getProductById(int id) {

		return this.womenProductDao.getProductById(id);
	}
}
