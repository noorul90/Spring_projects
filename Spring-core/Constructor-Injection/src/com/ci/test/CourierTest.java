package com.ci.test;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.OrderProcessor;

public class CourierTest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ci/common/application-context.xml"));
		OrderProcessor op = factory.getBean("orderProcessor" , OrderProcessor.class);
		op.checkOut(new ArrayList<String>(), "address");


	}

}
