package com.dc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dc.beans.Person;

public class DCTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/dc/common/application-context.xml"));
		Person person =(Person) factory.getBean("person");
		System.out.println(person);
		
		/*Passport psprt =(Passport) factory.getBean("passport");
		System.out.println(psprt);*/
	}

}
