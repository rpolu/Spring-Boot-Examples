package com.elegant.boot.studentboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudentbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(StudentbootApplication.class, args);
		StudentService ss = cac.getBean(StudentService.class);
		ss.savaStudentData();
	}

}
