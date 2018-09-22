package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.CacheAspect;
import com.aa.beans.Calculator;
import com.aa.beans.LoggingAspect;

public class AACacheTest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());

		/*
		 * keep in mind order of adding the multiple advices here into
		 * ProxyFactory is matters, if you not add the order properly the
		 * meaning of output is completely changes
		 */
		
		pf.addAdvice(new CacheAspect());

		pf.addAdvice(new LoggingAspect());

		Calculator proxy = (Calculator) pf.getProxy();
		System.out.println("sum: " + proxy.add(10, 20));
		System.out.println("sum: " + proxy.add(10, 20));
	}

}
