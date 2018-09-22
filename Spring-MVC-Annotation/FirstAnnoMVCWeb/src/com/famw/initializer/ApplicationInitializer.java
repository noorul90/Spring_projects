package com.famw.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {
	//we can also implements from ServletContextInitializer(J2EE class)

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		ServletRegistration.Dynamic dispatcherConfig = container.addServlet("dispatcher", new DispatcherServlet());
		dispatcherConfig.addMapping("*.htm");
		dispatcherConfig.setLoadOnStartup(1);
	}
	
}
