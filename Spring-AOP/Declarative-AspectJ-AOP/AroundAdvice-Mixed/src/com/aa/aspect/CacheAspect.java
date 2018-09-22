package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.Cache;

public class CacheAspect {
	private Cache cache;
	
	public CacheAspect(Cache cache) {
		this.cache = cache;
	}
	
	public Object doCache(ProceedingJoinPoint pjp) throws Throwable{
		String methodName=null;
		Object[] args=null;
		String key=null;
		
		
		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		
		System.out.println("cache- entered into: "+methodName+"("+args[0]+","+args[1]+")");
		
		//logic which execute before taget class method get executed
		key = methodName;
		for(int i=0; i<args.length; i++){
			if(i==0){
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		
		//cache = new Cache();
		if(cache.containskey(key)==true){
			return cache.get(key);
		}
		
		//let target class method get executed
		//here no arguments is modified,so call no-arg proceed method
		Object ret = pjp.proceed();
		
		System.out.println("cache- returning from: "+methodName+"("+args[0]+","+args[1]+")");
		
		//logic which execute after target class method execution completed
		cache.put(key, ret);
		
		return ret;
		
	}

}
