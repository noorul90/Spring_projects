package com.ia.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ia.beans.PetAnimal;

public class IATest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ia/common/application-context.xml"));
		PetAnimal dog = factory.getBean("pet" , PetAnimal.class);
		System.out.println(dog);

	}

}
