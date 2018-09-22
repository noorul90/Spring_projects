package com.na.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.na.beans.House;

public class NATest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/na/common/application-context.xml"));
		House h1 = factory.getBean("house" , House.class);
		System.out.println(h1);

	}

}
