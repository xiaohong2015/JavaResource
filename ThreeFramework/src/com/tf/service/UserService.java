package com.tf.service;

import java.io.Serializable;

import com.tf.model.User;

public interface UserService {

	public User findById(Serializable id);
}
