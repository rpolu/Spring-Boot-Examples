package com.elegant.spring.mvc.jdbc.springbootmvcjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.elegant")
public class SpringbootmvcjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcjdbcApplication.class, args);
	}

}
