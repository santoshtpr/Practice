package com.santoshtpr.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.santoshtpr.entity.Employee;

@Repository

public class LoginDao {
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("/login")
	public void validateLogin(HttpServletRequest req, HttpServletResponse res) {
		Session s = sf.getCurrentSession();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		String hql = "from Employee where empname= :fn";    
        Query query = s.createQuery(hql);
        query.setParameter("fn", username);
        query.setMaxResults(1);
        Employee emp = (Employee) query.uniqueResult(); 
        System.out.println(emp.getEmpId());
		
	
		
		
	}
	
}
