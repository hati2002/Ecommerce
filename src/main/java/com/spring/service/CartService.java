package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.CartDao;
import com.spring.user.Item;

@Service
public class CartService {

	@Autowired
	private CartDao cartDao;
	
	public int createproduct(Item item) {
		
		return this.cartDao.saveItem(item);
	}
	
	public List<Item> getcartproduct(){
		
		return this.cartDao.getalliItems();
	}
}
