package com.ir.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ir.beans.Car;

public class IRTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ir/common/application-context.xml"));
		Car car = factory.getBean("car" , Car.class);
		car.run();
		System.out.println("car is running");
	}

}
