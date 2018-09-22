package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.GlobalExceptionLoggingAspect;
import com.ta.beans.Thrower;

public class TATest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Thrower());
		pf.addAdvice(new GlobalExceptionLoggingAspect());
		Thrower proxy = (Thrower)pf.getProxy();
		System.out.println("flag: "+proxy.willThrow(1));
	}

}
