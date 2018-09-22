package com.baw.beans;

public class Car {
	
	//here attribute name engine and bean id of Engine type can be anything
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}
