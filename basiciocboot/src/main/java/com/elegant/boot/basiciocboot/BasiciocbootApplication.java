package com.elegant.boot.basiciocboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasiciocbootApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext cap = SpringApplication.run(BasiciocbootApplication.class, args);
		EmployeeService es = cap.getBean(EmployeeService.class);
		es.m1();
	}

}
