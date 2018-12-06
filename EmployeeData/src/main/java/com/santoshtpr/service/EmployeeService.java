package com.santoshtpr.service;

import com.santoshtpr.entity.Employee;

public interface EmployeeService {
	public boolean login(String userName, String password);
	public int addEmployee(Employee e);
	

}
