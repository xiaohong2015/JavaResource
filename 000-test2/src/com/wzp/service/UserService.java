package com.wzp.service;


import com.wzp.dto.UserDto;

public interface UserService {
	public UserDto findByName(String username);

}
