package com.santoshtpr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.santoshtpr.service.AddService;

@Controller
public class AddController {
@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
	int val1 = Integer.parseInt(req.getParameter("t1"));
	int val2 = Integer.parseInt(req.getParameter("t1"));
	int result = new AddService().add(val1, val2);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("Display.jsp");
	mv.addObject("result", result);
	return mv;
}
}
