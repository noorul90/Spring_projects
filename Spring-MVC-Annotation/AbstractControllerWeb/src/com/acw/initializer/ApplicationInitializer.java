package com.acw.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.acw.config.WebMVCConfig;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
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
