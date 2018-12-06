package com.santoshtpr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santoshtpr.dao.EmployeeDao;
import com.santoshtpr.entity.Employee;
@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired  
	EmployeeDao dao;
	public boolean login(String userName, String password) {
		Employee e = new Employee();
		e.setEmpName(userName);
		return dao.LoginEmployee(e);
	}

	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

}
