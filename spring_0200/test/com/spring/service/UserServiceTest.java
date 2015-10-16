package com.spring.service;

import org.junit.Test;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserServiceTest {
	/*
	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = new UserService();
		UserDAO userDAO = (UserDAO)factory.getBean("u");
		User u = new User();
		UserService service = (UserService)ctx.
		service.add(u);
	}
	 */
	
	@Test
	public void testAdd() throws Exception {

	//	BeanFactory applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)applicationContext.getBean("userService");
		
		
		
		
		
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
		
	}
}
