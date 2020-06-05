package com.elegant.jdbc.springbootjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.elegant.jdbc.model.UserModel;
import com.elegant.jdbc.service.UserService;

@SpringBootApplication
@ComponentScan("com.elegant")
public class SpringbootjdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca = SpringApplication.run(SpringbootjdbcApplication.class, args);

		UserModel userModel = new UserModel();
		userModel.setMobilNum(new Long(9538650201l));
		userModel.setFirstName("rama");
		userModel.setLastName("mohan");
		userModel.setAddress("bangalore");
		userModel.setEmail("abc@gmail.com");

		UserService us = ca.getBean(UserService.class);

		us.saveUser(userModel);

		System.out.println("User Data saved");

	}

}
