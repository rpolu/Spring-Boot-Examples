package com.elegant.boot.basiciocboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmpDao empDao;

	void m1() {
		System.out.println(" I need to call to Dao");
		empDao.saveData();
	}
}
