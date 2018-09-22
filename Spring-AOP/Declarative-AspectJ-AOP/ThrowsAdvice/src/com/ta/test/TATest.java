package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ta.beans.Thrower;

public class TATest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ta/common/application-context.xml");
		Thrower proxy = context.getBean("thrower", Thrower.class);
		System.out.println("flag: " + proxy.willThrow(2));
	}

}
