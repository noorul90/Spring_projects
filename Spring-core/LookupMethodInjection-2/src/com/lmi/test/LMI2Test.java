package com.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lmi.beans.Car;
import com.lmi.beans.IEngine;

public class LMI2Test {
	
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lmi/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.start();

	}

}
