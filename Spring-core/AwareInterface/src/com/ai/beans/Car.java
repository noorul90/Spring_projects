package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {
	private BeanFactory factory;
	private IEngine engine;
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void run(){
		engine = factory.getBean(beanId, IEngine.class);
		engine.start();
		System.out.println("car is running.....");
		
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
	}
	
	

}
