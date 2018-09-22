package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditAspect implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		
		//logic to execute before target class method get executed
		System.out.println("target class method: "+method.getName()); 
		System.out.println("logged in by user john");
		
		//from here controle goes to target class method automatically
	}
	
}
