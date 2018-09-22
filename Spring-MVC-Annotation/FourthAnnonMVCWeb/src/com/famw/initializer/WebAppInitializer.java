package com.famw.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.famw.configuration.RootAppConfig;
import com.famw.configuration.WebMVCConfig;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(RootAppConfig.class);
		
		ContextLoaderListener listener = new ContextLoaderListener(rootContext);
		container.addListener(listener);
		
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(WebMVCConfig.class);
		
		DispatcherServlet dispatcher = new DispatcherServlet(webContext);
		ServletRegistration.Dynamic dispatcherConfig = container.addServlet("dispatcher", dispatcher);
		dispatcherConfig.setLoadOnStartup(2);
		dispatcherConfig.addMapping("*.htm");
				
	}
	

}
