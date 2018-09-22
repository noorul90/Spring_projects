package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanCalculator;

public class DOnTest {

	public static void main(String[] args)throws Exception {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/don/common/application-context.xml"));
		LoanCalculator lc = factory.getBean("loanCalculator" , LoanCalculator.class);
		float amt = lc.calculate(50000, 3, "DEL");
		System.out.println("Intrest Amount : "+amt);
	}

}
