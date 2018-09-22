package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Calculator cal = null;

		// log before target class method get executed
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		// gives target class object
		methodInvocation.getThis();
		logMethod(methodName, args);
		
		//modify argument of method before calling- controle point-1
		args[0] = (Integer)args[0]+1;
		args[1] = (Integer)args[1]+2;

		// let the target class method get executed- controle point-2
		Object ret = methodInvocation.proceed();

		// do logging as target class method finish execution
		System.out.println("returning from: " + methodName + "(" + args[0]
				+ "," + args[1] + ") return value: " + ret);

		//modify the return value- controle point-3
		ret = (Integer)ret+10;
		
		return ret;
	}

	private void logMethod(String methodName, Object[] args) {
		System.out.print("entered into " + methodName + "(");
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
