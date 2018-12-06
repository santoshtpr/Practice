package com.santoshtpr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.santoshtpr.service.EmployeeService;

@Controller
public class LoginController {
	{System.out.println("Hello this is instantiated");}
//	@Autowired
//	private EmployeeService service;
	
@RequestMapping("/logout")
	public String verifyLogin(HttpServletRequest req, HttpServletResponse res) {
	///service.login(req.getParameter("username"), "1234");
	System.out.println("Came into Login controller new code");
	return "dashborad";
	}
}
