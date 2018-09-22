package com.si.test;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.beans.OrderProcessor;

public class CourierTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/si/common/application-context.xml"));
		//OrderProcessor op = (OrderProcessor)factory.getBean("orderProcessor");   ===> or
		OrderProcessor op = factory.getBean("orderProcessor" , OrderProcessor.class);
		op.checkOut(new ArrayList<String>(), "address");


	}

}
