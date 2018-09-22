package com.ac.dependson.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ac.dependson.*");
		
	}

}
