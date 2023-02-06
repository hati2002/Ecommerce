package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.user.Item;

@Transactional
@Repository
public class CartDao {

	@Autowired
	private org.hibernate.SessionFactory seseion;
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

	public void removeitem(Item item) {
		org.hibernate.Session session= seseion.getCurrentSession();
		session.delete(item);
		session.flush();
		
	}
	
	public Item getbyproductId(int prodid) {
		org.hibernate.Session session= seseion.getCurrentSession();
		Query query = session.createQuery("from Item where productId="+prodid);
		session.flush();
		
		return (Item) query.uniqueResult();
		
	}
}
