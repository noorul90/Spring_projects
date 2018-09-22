package com.ac.value.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/value/annon/application-context.xml");
		Robot rob = context.getBean("robot", Robot.class);
		System.out.println(rob);
	}

}
