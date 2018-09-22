package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		if(method.getName().equals("findPlans")){
		System.out.println("Name:"+method.getName());
		System.out.println("Parameters:");
		System.out.println("ageGroup:"+args[0]);
		System.out.println("coverageType:"+args[1]);
		System.out.println("networkType:"+args[2]);
		
		return new String[]{"jeevan anand"};
	}
		return null;
  }
	

}
