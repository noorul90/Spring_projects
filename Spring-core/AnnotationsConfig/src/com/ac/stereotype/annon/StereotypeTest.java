package com.ac.stereotype.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTest {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/stereotype/annon/application-context.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ac.stereotype.*");
		BiCycle bicycle = context.getBean("ranger", BiCycle.class);
		bicycle.ride();
	}

}
