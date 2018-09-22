package com.ac.scope.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/scope/annon/application-context.xml");
		BiCycle bc1 = context.getBean("biCycle", BiCycle.class);
		BiCycle bc2 = context.getBean("biCycle", BiCycle.class);
		System.out.println("bc1==bc2 :" + (bc1==bc2));
	}

}
