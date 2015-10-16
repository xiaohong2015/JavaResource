package com.wzp.action;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Service;


import com.opensymphony.xwork2.ActionSupport;
import com.wzp.dto.UserDto;
import com.wzp.service.UserService;

public class UserAction extends ActionSupport {
	private String username;   //前台的login.jsp通过表单提交会将username的值传送到setUsername(String username){this.username = username;}中，从而为username赋值。
	private String password;
	private String identification;

	@Resource(name = "userService")   //Spring注解有初始化作用，用于获取名字为userService的实例化对象，即UserServiceImpl类中的@Service("userService") 创建出来的实例化对象
	private UserService userService;

	public String execute() {
		HttpServletRequest request=ServletActionContext.getRequest();
		UserDto user = userService.findByName(username);
		if (user != null) {
			int identification2 = user.getIdentity();
			if (!(password.trim().equals(user.getPassword().trim()))) {
				
				request.setAttribute("msg", "password error");
				
				System.out.println("密码错误");
				return "default";
			}
			if (!(identification.trim().equals(String.valueOf(identification2)))) {
				
				request.setAttribute("msg", "identification error");
				
				System.out.println("身份错误");
				return "default";
			}
			if (identification2 == 0) {
				
				System.out.println("用户登陆成功");
				return "user";
			} else if (identification2 == 1) {
							
				System.out.println("管理员登陆成功");
				return "manager";
			} else if (identification2 == 2) {
				System.out.println("超级管理员登陆成功");
				return "manager";
			} else
				return "default";

		} else {
			request.setAttribute("msg", "no user");
			System.out.println("不存在此用户！");
			return "default";
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

}
