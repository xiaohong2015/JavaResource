package com.wzp.dao;

import java.util.List;

import com.wzp.dto.UserDto;

public interface UserDao {
  
	 public List<UserDto> searchByname(String username);
	 
}
