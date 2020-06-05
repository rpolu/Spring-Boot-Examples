package com.elegant.spring.mvc.service;

import java.util.List;

import com.elegant.spring.mvc.model.UserModel;

public interface UserService {
	public List<UserModel> getUsers();

	public void saveUser(UserModel userModel);
	
	public void deleteUser(String phno);
}
