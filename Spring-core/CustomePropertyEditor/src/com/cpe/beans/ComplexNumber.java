package com.cpe.beans;

public class ComplexNumber {
	private int base;
	private int expo;
	
	public void setBase(int base) {
		this.base = base;
	}
	public void setExpo(int expo) {
		this.expo = expo;
	}
	
	public ComplexNumber(){
		
	}
	
	public ComplexNumber(int base, int expo) {
		super();
		this.base = base;
		this.expo = expo;
	}
	
	@Override
	public String toString() {
		return "ComplexNumber [base=" + base + ", expo=" + expo + "]";
	}
	
}
