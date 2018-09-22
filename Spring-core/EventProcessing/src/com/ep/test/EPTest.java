package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.beans.RefreshEventSource;

public class EPTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ep/common/application-context.xml");
		RefreshEventSource source = context.getBean("refreshEventSource", RefreshEventSource.class);
		source.raiseRefresh("EMPLOYEE_TABLE");
	}

}
