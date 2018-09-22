package com.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ara.beans.KeyGenerator;

public class ARTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ara/common/application-context.xml");
		KeyGenerator proxy = context.getBean("keyGenerator", KeyGenerator.class);
		System.out.println("Generated Key: " + proxy.generateKey(2));
		
	}

}