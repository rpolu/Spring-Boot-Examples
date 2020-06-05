package com.elegant.boot.studentboot;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	void saveStudent() {
		System.out.println("Studen data saved");
	}

}
