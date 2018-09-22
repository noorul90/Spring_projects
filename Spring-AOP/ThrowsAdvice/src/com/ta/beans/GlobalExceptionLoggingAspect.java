package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GlobalExceptionLoggingAspect implements ThrowsAdvice {

	/*
	 * here last method will be(only applicable for exact match) called by aop
	 * because it internally uses stack for calling methods, but it is not
	 * always true its varry from jvm to jvm or os to os, and for resolving
	 * Exception type conflict exact match exception have higher perference to
	 * call than Exception hierarichy or parent exception argument methods
	 */

	public void afterThrowing(Method method, Object[] args, Object target,
			IllegalArgumentException iae) {
		System.out.println("Exception thrown by :" + method.getName() + "("
				+ args[0] + ") with Exception message: " + iae.getMessage());
	}

	/*
	 * public void afterThrowing(IllegalArgumentException iae) {
	 * System.out.println("Exception message: " + iae.getMessage()); }
	 */

	/*// lowest priority to call becoz it is not exact match
	public void afterThrowing(Exception e) {
		System.out.println("Global Exception message: " + e.getMessage());
	}*/

}
