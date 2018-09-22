package com.ir.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	
	//private IEngine engine;
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public void run(){
		
		IEngine engine=null;
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ir/common/application-context.xml"));
		engine = factory.getBean(beanId , IEngine.class);
		engine.start();
		System.out.println("Engine is started succesfully");
	}

}
