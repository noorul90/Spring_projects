package com.ac.scope.annon;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BiCycle {
	
	public void ride(){
		System.out.println("running.....");
	}

}
