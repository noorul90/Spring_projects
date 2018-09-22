package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.util.Cache;

public class CacheAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key =null;
		Cache cache = null;
		
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		
		//logic which execute before taget class method get executed
		key = methodName;
		for(int i=0; i<args.length; i++){
			if(i==0){
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		
		cache = Cache.getInstance();
		if(cache.containskey(key)==true){
			return cache.get(key);
		}
		
		//let target class method get executed
		Object ret = methodInvocation.proceed();
		
		//logic which execute after target class method execution completed
		cache.put(key, ret);
		
		return ret;
	}
	
}
