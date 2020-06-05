package com.elegant.jdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elegant.jdbc.dao.UserDao;
import com.elegant.jdbc.model.UserModel;
import com.elegant.jdbc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void saveUser(UserModel userModel) {
		userDao.saveUser(userModel);
	}

}
