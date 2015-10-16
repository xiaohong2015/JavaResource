package com.spring.service;

import com.spring.dao.UserDAO;
import com.spring.dao.impl.UserDAOImpl;
import com.spring.model.User;

public class UserService {

	//需要用哪个就New谁
	private UserDAO userDAO = new UserDAOImpl();
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void add(User u) {
		this.userDAO.save(u);
	}

}
