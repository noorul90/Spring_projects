package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

public class AuditAspect {
	public void audit(JoinPoint jp){
		String methodName=null;
		Object[] args=null;
		
		methodName = jp.getSignature().getName();
		args = jp.getArgs();
		//logic to execute before target class method get executed
		System.out.println(methodName + "(" + args[0] + ")" + " has been called by john");
		//at this poin controle automatically goes to target class method
	}

}
