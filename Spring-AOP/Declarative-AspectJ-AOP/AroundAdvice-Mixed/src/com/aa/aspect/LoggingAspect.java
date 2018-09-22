package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.beans.Calculator;

public class LoggingAspect {

	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Calculator cal = null;

		// log before target class method get executed
		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		// gives target class object
		logMethod(methodName, args);
		
		//modify argument of method before calling- controle point-1
		args[0] = (Integer)args[0]+1;
		args[1] = (Integer)args[1]+2;

		// let the target class method get executed- controle point-2
		//Object ret = pjp.proceed();
		//to reflect the modifies args value(clone object)
		Object ret = pjp.proceed(args);

		// do logging as target class method finish execution
		System.out.println("logging- returning from: " + methodName + "(" + args[0]
				+ "," + args[1] + ")");
		
		//modify the return value- controle point-3
		 ret = (Integer)ret+10;
		
		return ret;
	}

	private void logMethod(String methodName, Object[] args) {
		System.out.print("logging- entered into: " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");

	}

}
