package com.ac.autowired.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/autowired/annon/application-context.xml");
		Toy toy = context.getBean("toy", Toy.class);
		System.out.println(toy);
	}

}
