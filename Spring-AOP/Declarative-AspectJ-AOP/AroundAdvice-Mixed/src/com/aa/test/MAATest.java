package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Calculator;

public class MAATest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aa/common/application-context.xml");
		Calculator proxy = context.getBean("calculator",Calculator.class);
		System.out.println("Sum: "+proxy.add(20, 40));
		System.out.println("Sum: "+proxy.add(20, 40));
		System.out.println("Sum: "+proxy.mul(20, 40));
		System.out.println("Sum: "+proxy.mul(20, 40));
	}

}