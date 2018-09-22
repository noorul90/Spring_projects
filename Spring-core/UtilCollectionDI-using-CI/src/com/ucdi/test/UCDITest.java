package com.ucdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ucdi.beans.Restaurent;

public class UCDITest {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ucdi/common/application-context.xml"));
		Restaurent rst = factory.getBean("srNagarBranch" , Restaurent.class);
		System.out.println(rst);

	}

}
