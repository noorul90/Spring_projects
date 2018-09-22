package com.baw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.baw.beans.Robot;

public class BAWTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/baw/common/application-context.xml"));
		Robot rob = factory.getBean("robot1", Robot.class);
		System.out.println(rob);
	}

}
