package com.ifmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifmi.beans.GoogleMapRenderer;

public class IFMITest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ifmi/common/application-context.xml"));
		GoogleMapRenderer gmr = factory.getBean("googleMapRendere", GoogleMapRenderer.class);
		gmr.renderMap("ameerpet", "srnagar");
	}

}
