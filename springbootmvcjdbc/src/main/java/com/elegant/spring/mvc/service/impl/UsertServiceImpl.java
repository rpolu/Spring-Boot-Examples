package com.elegant.spring.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elegant.spring.mvc.dao.UserDao;
import com.elegant.spring.mvc.model.UserModel;
import com.elegant.spring.mvc.service.UserService;

@Service
public class UsertServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public List<UserModel> getUsers() {
		return userDao.getUsers();
	}

	public void saveUser(UserModel userModel) {
		userDao.saveUser(userModel);
	}
	
	public void deleteUser(String phno) {
		userDao.deleteUser(phno);
	}
}
