package com.spring.service;

import org.junit.Test;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserServiceTest {
	
	@Test
	public void testAdd() throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)ctx.getBean("userService");

		UserService service2 = (UserService)ctx.getBean("userService");
		System.out.println(service == service2);
		
		
		
		
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
		
	}
}
