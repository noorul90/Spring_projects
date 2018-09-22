package com.jcpa.postconstruct_predestroy.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostPreTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jcpa/postconstruct_predestroy/annon/application-context.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
