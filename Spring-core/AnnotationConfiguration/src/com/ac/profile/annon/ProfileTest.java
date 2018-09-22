package com.ac.profile.annon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("Test");
		context.scan("com.ac.profile.*");
		context.refresh();
		DataSource dSource = context.getBean("dataSource", DataSource.class);
		dSource.ping();
	}

}
