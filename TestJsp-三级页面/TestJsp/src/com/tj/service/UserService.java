package com.tj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.tj.model.User;

@Service("userService")
public class UserService {

	@Resource
	private HibernateTemplate hibernateTemplate;
	
	public User getOne(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return this.hibernateTemplate.find("from User n");
	}
}
