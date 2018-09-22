package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Person;

public class BATest {

	public static void main(String[] args) {
       
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		Person prsn = factory.getBean("p4" , Person.class);
		System.out.println(prsn);
		
		String[] aliases = factory.getAliases("person");
		for(String alias: aliases ){
			System.out.println("alias = "+alias);
		}
	}

}
