package com.tamw.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractDispatcherServletInitializer {
	//AbstractDispatcherServletInitializer will be added in spring 3.2 version 

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext servletAppContext = null;
		servletAppContext = new XmlWebApplicationContext();
		servletAppContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return servletAppContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext rootAppContext = null;
		rootAppContext = new XmlWebApplicationContext();
		rootAppContext.setConfigLocation("/WEB-INF/application-context.xml");
		return rootAppContext;
	}
	
}
