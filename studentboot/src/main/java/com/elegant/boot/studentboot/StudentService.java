package com.elegant.boot.studentboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;

	void savaStudentData() {
		System.out.println("I need to save the Data");
		dao.saveStudent();
	}
}
