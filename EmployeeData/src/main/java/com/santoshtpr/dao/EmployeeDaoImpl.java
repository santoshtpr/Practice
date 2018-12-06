package com.santoshtpr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.santoshtpr.entity.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SessionFactory sf;

	public boolean LoginEmployee(Employee e) {
		Session session = sf.openSession();
		String hql = "from Employee where empname= :fn";
		@SuppressWarnings("unchecked")
		Query<Employee> query = session.createQuery(hql);
		query.setParameter("fn", e.getEmpName());
		query.setMaxResults(1);
		Employee emp = (Employee) query.uniqueResult();
		System.out.println(emp.getEmpId());
		return false;
	}

	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

}
