package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.user.Product;

@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(Product product) {

		int i = (Integer) this.hibernateTemplate.save(product);

		return i;
	}

	public List<Product> getallProducts() {

		return this.hibernateTemplate.loadAll(Product.class);
	}

	public Product getProductById(int id) {

		return this.hibernateTemplate.get(Product.class, id);
	}
}
