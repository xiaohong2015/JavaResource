package com.spring.service;

import org.junit.Test;

import com.spring.BeanFactory;
import com.spring.ClassPathXmlApplicationContext;
import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserServiceTest {
/*
	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext();
		
		UserService service = new UserService();
		UserDAO userDAO = (UserDAO)factory.getBean("u");
		User u = new User();
		service.add(u);
	}
*/

	@Test
	public void testAdd() throws Exception {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		
		
		UserService service = (UserService)applicationContext.getBean("userService");
		
		
		
		
		
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}
}
