package com.baw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.baw.beans.Car;

public class BATest {
	
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/baw/common/application-context.xml"));
		Car c = factory.getBean("car" , Car.class);
		System.out.println(c);
	}

}
