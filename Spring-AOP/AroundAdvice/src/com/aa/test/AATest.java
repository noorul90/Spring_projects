package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.Calculator;
import com.aa.beans.LoggingAspect;


public class AATest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAspect());
		
		Calculator proxy =(Calculator) pf.getProxy();
		System.out.println("sum: "+proxy.add(10, 20));
	
	}

}
