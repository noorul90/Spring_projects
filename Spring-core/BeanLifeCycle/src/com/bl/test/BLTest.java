package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Math;

public class BLTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bl/common/application-context.xml"));
		Math mathObj = factory.getBean("math", Math.class);
		System.out.println(mathObj);
		// ((ConfigurableListableBeanFactory)factory).destroySingletons();
		// System.out.println(m);
	}

}
