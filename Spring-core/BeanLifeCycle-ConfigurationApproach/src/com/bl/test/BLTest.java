package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Math;
import com.bl.beans.JVMShutdownHook;

public class BLTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bl/common/application-context.xml"));
		JVMShutdownHook sdh = factory.getBean("shutdownHook", JVMShutdownHook.class);
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(sdh));
		Math mathObj = factory.getBean("math", Math.class);
		System.out.println(mathObj);
	}

}
