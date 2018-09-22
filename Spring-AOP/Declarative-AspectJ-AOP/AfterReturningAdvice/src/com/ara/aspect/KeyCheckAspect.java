package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {
	public void validate(JoinPoint jp, Object ret){
		if((Long)ret<=0){
			throw new IllegalArgumentException("Invalid Key has been generated");
		}
		
	}

}
