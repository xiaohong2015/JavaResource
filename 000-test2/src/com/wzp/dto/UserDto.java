package com.wzp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity   //hibernate注解，将该类与数据库中表名字为userdto的表格联系在一起
public class UserDto {
	
	@Id    //hibernate注解，用于设置数据库主键
	@GeneratedValue  //hibernate注解，用于设置数据库主键的生成策略，例如从 1 开始生成主键的索引
	private int userId;  //用户ID
	private int identity; //身份
	private String username;  //用户名
	private String password;   //密码
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
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
	
	
	
}
