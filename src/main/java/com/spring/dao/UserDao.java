package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.user.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(User user) {

		int i = (Integer) this.hibernateTemplate.save(user);
		return i;
	}

	public List<User> getAllUserData() {

		return this.hibernateTemplate.loadAll(User.class);

	}
}
