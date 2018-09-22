package com.bl.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Math implements InitializingBean, DisposableBean {
	
	private int i;
	private int j;
	private int sum;
	
	public Math(int i) {
		super();
		this.i = i;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	/*
	 //code for Managing bean life cycle using Cofiguration approach
	
	 //lifeCycle methods---> userdefined methods
	public void startUp(){
		System.out.println("startUp() method call");
		this.sum = this.i + this.j;
	}
	
	@Override
	public String toString() {
		return "Math [i=" + i + ", j=" + j + ", sum=" + sum + "]";
	}

	//lifeCycle methods---> userdefined method
	public void shuttingDown(){
		System.out.println("shuttingDown() method call");
		System.out.println("releasing resourcess......");
	}
	*/

	// code for Managing Bean life Cycle using Programatic approach
	
    //lifeCycle methods--->predefined methods of InitializingBean interface
	@Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() method call");
		this.sum = this.i + this.j;
	}
	
	//lifeCycle methods--->predefined methods of DisposableBean interface
	@Override
	public void destroy() throws Exception {
        System.out.println("destroy() method call");
		System.out.println("releasing......");
	}
	
	@Override
	public String toString() {
		return "Math [i=" + i + ", j=" + j + ", sum=" + sum + "]";
	}
	
}
