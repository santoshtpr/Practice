package com.santoshtpr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.sanoshtpr.service","com.sanoshtpr.dao","com.sanoshtpr.controller"})
public class SpringConfig {
public InternalResourceViewResolver viewResolver() {
	InternalResourceViewResolver vr = new InternalResourceViewResolver();
	vr.setPrefix("dashboard");
	vr.setSuffix("jsp");
	return vr;
}
	
}
