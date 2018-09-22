package com.tsmw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@EnableWebMvc
@Configuration
@ComponentScan("com.tsmw.*")
public class WebMVCConfig extends WebMvcConfigurationSupport {

	/**
	 *  if we do not extends our class(WebMVCConfig) from WebMvcConfigurationSupport then to enable 
	 *  RequestMappingHandlerMapping use @EnableWebMvc annotation, otherwise not becoz after 
	 *  extending our class from WebMvcConfigurationSupport class it enable by default
	 */
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource setUpResource(){
		ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
		rb.setBasename("messageSource");
		return rb;
	}
	
	@Override
	protected void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/searchTicket.htm").setViewName("search-ticket");// by default RequestMappingHandlerMapping will set as setViewName("search-ticket");
	}

	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {

		registry.jsp("/WEB-INF/jsp/",".jsp");
	}
	

}
