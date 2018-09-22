package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.University;

public class CDITest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		/*
		Course course = factory.getBean("btechcse1stsem" , Course.class);
		System.out.println(course);
		*/
		
		University unv = factory.getBean("university" , University.class);
		System.out.println(unv);
		

	}

}
