package com.wzp.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.wzp.dao.UserDao;
import com.wzp.dto.UserDto;



@Repository("UserDao") //Spring注解有初始化作用，创建UserDaoimpl这个类的一个实例化对象名字为UserDao--> = UserDaoimpl UserDao = new UserDaoimpl()
public class UserDaoimpl implements UserDao{
	
	@Resource   //Spring注解有初始化作用，用于获取实例化对象，
	private HibernateTemplate hibernateTemplate; 

	
	public List<UserDto> searchByname(String username){
		return this.hibernateTemplate.find(username);		
	}
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
