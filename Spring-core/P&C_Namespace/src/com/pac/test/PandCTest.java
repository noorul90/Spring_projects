package com.pac.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pac.beans.Person;

public class PandCTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pac/common/application-context.xml"));
		Person prsn = factory.getBean("person" , Person.class);
		System.out.println(prsn);
	}

}
