package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.user.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public int createUser(User user) {

		return this.userDao.saveUser(user);
	}

	public List<User> getall(){
		
		return userDao.getAllUserData();
	}
}
