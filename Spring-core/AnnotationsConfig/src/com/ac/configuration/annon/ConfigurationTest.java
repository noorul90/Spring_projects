package com.ac.configuration.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*Sensor s1 = context.getBean("sensor", Sensor.class);
		Sensor s2 = context.getBean("sensor", Sensor.class);
		System.out.println("s1==s2: ? " + (s1==s2));
		System.out.println(s1);
		System.out.println(s2);*/
		
		//for calling Bean lifeCycle method
		((ConfigurableApplicationContext)context).registerShutdownHook();
		Toy t = context.getBean("toy" , Toy.class);
		System.out.println(t);
	}

}
