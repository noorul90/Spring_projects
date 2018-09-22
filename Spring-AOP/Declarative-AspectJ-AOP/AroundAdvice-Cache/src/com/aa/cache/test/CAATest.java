package com.aa.cache.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.cache.beans.Calculator;

public class CAATest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aa/cache/common/application-context.xml");
		Calculator proxy = context.getBean("calculator",Calculator.class);
		System.out.println("Sum: "+proxy.add(20, 40));
		System.out.println("Sum: "+proxy.add(20, 40));
	}

}