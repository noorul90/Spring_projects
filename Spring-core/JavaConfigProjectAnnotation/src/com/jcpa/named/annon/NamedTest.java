package com.jcpa.named.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NamedTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jcpa/named/annon/application-context.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}

}
