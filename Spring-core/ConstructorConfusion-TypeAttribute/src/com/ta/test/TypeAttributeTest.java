package com.ta.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ta.beans.Person;

public class TypeAttributeTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ta/common/application-context.xml"));
		Person p = factory.getBean("person" , Person.class);
		System.out.println(p);

	}

}
