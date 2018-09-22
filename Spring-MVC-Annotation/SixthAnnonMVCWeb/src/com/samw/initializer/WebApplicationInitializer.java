package com.samw.initializer;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.samw.config.RootAppConfig;
import com.samw.config.WebMVCConfig;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		//return new Class[]{RootAppConfig.class};  //OR
		
		/**
		 * As we don't write any business class inside our application
		 * hence better to return null here
		 */
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[]{WebMVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"*.htm"};
	}

}
