package com.bl.beans;

public class Math {
	
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
	
	//lifeCycle methods
	public void startUp(){
		this.sum = this.i + this.j;
	}

	@Override
	public String toString() {
		return "Math [i=" + i + ", j=" + j + ", sum=" + sum + "]";
	}
	
	//lifeCycle methods
	public void shuttingDown(){
		System.out.println("releasing resourcess......");
	}
}
