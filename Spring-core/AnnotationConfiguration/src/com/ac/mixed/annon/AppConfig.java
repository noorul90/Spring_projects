package com.ac.mixed.annon;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ac.mixed.*")
public class AppConfig {
	
	/*@Bean
	//@Scope("prototype")
	public Course newCourse(){
		Course course = new Course();
		course.setId(1021);
		course.setName("btechcse");
		return course;
	}*/
	
	@Bean(name="college", autowire=Autowire.BY_TYPE)
	@Scope("prototype")
	public College newCollege(){
		College college = new College();
		return college;
	}
	
	@Bean(name="appVal")
	public Properties createAppProperties() throws IOException{
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("app_val.properties"));
		return props;
	}
	

}
