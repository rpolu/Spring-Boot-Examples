package com.elegant.jdbc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.elegant.jdbc.dao.UserDao;
import com.elegant.jdbc.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_USER = "INSERT INTO USERS VALUES(?,?,?,?,?)";

	public void saveUser(UserModel userModel) {
		jdbcTemplate.update(INSERT_USER, userModel.getMobilNum(), userModel.getFirstName(), userModel.getLastName(),
				userModel.getAddress(), userModel.getEmail());
	}

}
