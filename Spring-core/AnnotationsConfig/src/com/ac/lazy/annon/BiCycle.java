package com.ac.lazy.annon;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy(true)
public class BiCycle {
	
	//to check object of bean is created lazily or eagerly
	public BiCycle(){
		System.out.println("BiCycle()");
	}
	
	public void ride(){
		System.out.println("running.....");
	}

}
