package com.tf.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tf.dao.UserDao;
import com.tf.model.User;
import com.tf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	// Dao 和 Service 通过注解作为唯一数据交流通道
	@Resource(name= "userDao")
	private UserDao userDao;
	
	@Override
	public User findById(Serializable id) {
		return userDao.findById(id);
	}

}
