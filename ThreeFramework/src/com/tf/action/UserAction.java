package com.tf.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.tf.model.User;
import com.tf.service.UserService;

/**
 * 2015年8月26日 ~ xiaohong
 * 
 * TODO
 */
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private int id;
	private User user;
	HttpServletRequest r= ServletActionContext.getRequest();
	@Resource(name="userService")
	private UserService userService;	
	
	public String ShowUser() {
		user= userService.findById(1);
		//System.out.println(user.getName());
		r.setAttribute("user", user);
		return Action.SUCCESS;
	}

	// get set methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
