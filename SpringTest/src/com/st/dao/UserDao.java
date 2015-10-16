package com.st.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.st.bean.User;

public class UserDao extends HibernateDaoSupport{

/*
	private SessionFactory sessionFactory;
	



	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}




	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	public void Insert(User user) {
		if(null == sessionFactory) {
			System.out.println("asdf");
		}
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		sessionFactory.close();
	}*/
	
	/*
	public void Insert(User user) {
		Session s = this.getSessionFactory().openSession();		
		if(null == s) {
			System.out.println("asdf");
		}
		s.beginTransaction();
		s.save(user);
		s.getTransaction();
		this.getSessionFactory().close();
	}*/
	public void Insert(User user) {
		this.getHibernateTemplate().save(user);
	}
}
