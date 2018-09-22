package com.jcpa.inject_resource.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inject_ResourceTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jcpa/inject_resource/annon/application-context.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}

}
