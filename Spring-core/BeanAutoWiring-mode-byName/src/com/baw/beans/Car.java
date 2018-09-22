package com.baw.beans;

public class Car {
	
	//here attribute name engine and bean id of Engine type must be same
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}
