package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.user.Item;
import com.spring.user.Product;

@Repository
public class CartDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveItem(Item item) {

		int i = (Integer) this.hibernateTemplate.save(item);

		return i;
	}

	public List<Item> getalliItems() {

		return this.hibernateTemplate.loadAll(Item.class);
	}

}
