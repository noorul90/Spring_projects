package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Toy;

public class BSTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bs/common/application-context.xml"));
		Toy toy1 = factory.getBean("toy" , Toy.class);
		Toy toy2 = factory.getBean("toy" , Toy.class);
		//check weather one obj or two obj is created(toy1 and toy2 is same objs or different objs) ?
		System.out.println("toy1==toy2 ?" + (toy1==toy2));
	}

}
