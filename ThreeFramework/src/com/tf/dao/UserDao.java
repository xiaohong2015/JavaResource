package com.tf.dao;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tf.model.User;

@Repository("userDao")
public class UserDao {

	@Resource(name= "ht")
	private HibernateTemplate ht;
	
	public User findById(Serializable id) {
		return ht.get(User.class, id);
	}
}
