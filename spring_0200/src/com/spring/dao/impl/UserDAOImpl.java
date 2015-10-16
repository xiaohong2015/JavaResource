package com.spring.dao.impl;

import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserDAOImpl implements UserDAO {
	@Override
	public void save(User u) {
		System.out.println("a user saved!!");
	}
}
