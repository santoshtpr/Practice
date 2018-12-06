package com.santoshtpr.dao;

import com.santoshtpr.entity.Employee;

public interface EmployeeDao {

	public boolean LoginEmployee(Employee e); 
	public int addEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	
}
