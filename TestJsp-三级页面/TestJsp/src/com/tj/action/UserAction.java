package com.tj.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.tj.model.User;
import com.tj.service.UserService;

public class UserAction {
	
	@Resource(name="userService")
	private UserService userService;
	
	private int id;
	
	public String all() {
		
		List<User> list = userService.getAll();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", list);		
		return "success";
	}
	
	public String one() {
		
		System.out.println(id);
		User user = userService.getOne(id);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("one", user);
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
