package com.elegant.spring.mvc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.elegant.spring.mvc.dao.UserDao;
import com.elegant.spring.mvc.mapper.UsersRowMapper;
import com.elegant.spring.mvc.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String GETUSERS = "SELECT * FROM USERS";

	public List<UserModel> getUsers() {
		List<UserModel> users = jdbcTemplate.query(GETUSERS, new UsersRowMapper());
		return users;
	}

}
