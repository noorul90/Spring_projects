package com.aacw.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {

		XmlWebApplicationContext webContext = new XmlWebApplicationContext();
		webContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return webContext;
	}

	@Override
	protected String[] getServletMappings() {

		return new String[]{"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		/**
		 * as we don't have any business class to configure (inside application-context.xml)
		 * So, better do not create IOC container
		 * hence return null to avoide to create IOC container
		 */
		
		return null;
	}
	

}
