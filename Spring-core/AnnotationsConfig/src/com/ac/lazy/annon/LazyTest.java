package com.ac.lazy.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {

	public static void main(String[] args) {
		//ApplicationContext is Eager Initializer, So if bean scope is singleton then it will create the object at this poin
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/lazy/annon/application-context.xml");
	}

}
