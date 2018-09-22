package com.ac.imprt.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentAppConfig.class);
		Motor motor1 = context.getBean("motor", Motor.class);
		System.out.println(motor1);
	}

}
