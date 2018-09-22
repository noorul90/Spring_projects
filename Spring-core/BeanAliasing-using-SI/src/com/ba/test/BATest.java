package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Person;

public class BATest {

	public static void main(String[] args) {
       
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		Person prsn = factory.getBean("p10, p11" , Person.class);
		System.out.println(prsn +"\n");
		
		String[] aliases = factory.getAliases("p1");
		for(String alias: aliases ){
			System.out.println("alias = "+alias);
		}
	}

}
