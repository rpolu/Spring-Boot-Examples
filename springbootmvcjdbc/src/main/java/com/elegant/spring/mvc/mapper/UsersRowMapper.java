package com.elegant.spring.mvc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.elegant.spring.mvc.model.UserModel;

public class UsersRowMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserModel userModel = new UserModel();
		userModel.setPhno(rs.getString("phno"));
		userModel.setFirstName(rs.getString("firtname"));
		userModel.setLastName(rs.getString("lastname"));
		userModel.setEmail(rs.getString("email"));
		userModel.setAddress(rs.getString("address"));
		return userModel;
	}

}
