package com.ac.stereotype.annon;

import org.springframework.stereotype.Component;

@Component("ranger")  //by default bean id is same as name of the class in camelcase notation(biCycle)
//@Controller
//@Service
//@Repository
public class BiCycle {
	
	public void ride(){
		System.out.println("running.....");
	}

}
