package com.st.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.st.bean.User;
import com.st.dao.UserDao;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory f = new XmlBeanFactory(r);
		User user = (User)f.getBean("User");
		
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) c.getBean("User");
		
		System.out.println(user.getUsername());
		*/
		
		//Dao、HibernateSpring
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao)c.getBean("userDao");
		User user = new User();
		user.setUsername("xiaoxiao");
		userDao.Insert(user);
		
		/*//JdbcTemplate
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jt = null;
		jt = (JdbcTemplate)c.getBean("jdbcTemplate");
		jt.update("insert into user(username) values ('xiaoyong')");*/

	}

}
