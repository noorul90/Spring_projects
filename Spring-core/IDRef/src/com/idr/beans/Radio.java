package com.idr.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Radio {
	
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void listen(float friquency){
		 IReciever reciever=null;
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/idr/common/application-context.xml"));
		reciever = factory.getBean(beanId , IReciever.class);
		reciever.tune(friquency);
		System.out.println("radio is started");
		
	}

}
