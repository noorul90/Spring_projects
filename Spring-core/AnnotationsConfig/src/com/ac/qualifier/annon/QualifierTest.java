package com.ac.qualifier.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/qualifier/annon/application-context.xml");
		Toy t = context.getBean("toy",Toy.class);
		System.out.println(t);
	}

}
