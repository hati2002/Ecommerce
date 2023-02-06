package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.cj.Session;
import com.spring.user.Product;
import com.spring.user.WomenProduct;

@Repository
public class WomenProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveproduct(WomenProduct womenProduct) {

		return (Integer) this.hibernateTemplate.save(womenProduct);
	}

	//fetch all data from database
	public List<WomenProduct> getallProducts() {

		return this.hibernateTemplate.loadAll(WomenProduct.class);
	}

	public WomenProduct getProductById(int id) {

		return this.hibernateTemplate.get(WomenProduct.class, id);
	}
}
