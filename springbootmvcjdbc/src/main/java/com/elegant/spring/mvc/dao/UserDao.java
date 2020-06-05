package com.elegant.spring.mvc.dao;

import java.util.List;

import com.elegant.spring.mvc.model.UserModel;

public interface UserDao {
	public List<UserModel> getUsers();
}
