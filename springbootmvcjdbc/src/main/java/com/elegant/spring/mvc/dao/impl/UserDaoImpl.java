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

	private static final String INSER_USER = "INSERT INTO USERS VALUES(?,?,?,?,?)";

	private static final String DELET_USER = "DELETE FROM USERS WHERE PHNO=?";

	public List<UserModel> getUsers() {
		List<UserModel> users = jdbcTemplate.query(GETUSERS, new UsersRowMapper());
		return users;
	}

	public void saveUser(UserModel userModel) {
		jdbcTemplate.update(INSER_USER, userModel.getPhno(), userModel.getEmail(), userModel.getFirstName(),
				userModel.getLastName(), userModel.getAddress());
	}

	public void deleteUser(String phno) {
		jdbcTemplate.update(DELET_USER, phno);
	}

}
