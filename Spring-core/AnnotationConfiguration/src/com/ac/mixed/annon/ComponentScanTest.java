package com.ac.mixed.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*Course course1 = context.getBean("newCourse", Course.class);
		Course course2 = context.getBean("newCourse", Course.class);
		System.out.println("course1==course2: ? "+(course1==course2));
		System.out.println(course1);*/
		College colg = context.getBean("college", College.class);
		System.out.println(colg);
	}
}
