package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.InternetSecurity;

public class CMTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cm/common/application-context.xml"));
	
	/*	InternetSecurity security = factory.getBean("advanceSecurityPkg" , InternetSecurity.class);
		System.out.println(security);     */
		
		InternetSecurity security = factory.getBean("premeumSecurityPkg" , InternetSecurity.class);
		System.out.println(security);
		 
		
	}

}
