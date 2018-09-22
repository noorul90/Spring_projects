package com.ta.aspect;

import org.aspectj.lang.JoinPoint;

public class ExceptionLoggingAspect {
	public void logException(JoinPoint jp, IllegalArgumentException ie){
		System.out.println("Exception thrown by: "+ jp.getSignature().getName()+"(-,-) with message: "+ie.getMessage());
		
	}

}