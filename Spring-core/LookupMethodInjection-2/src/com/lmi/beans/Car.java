package com.lmi.beans;

//Target class
abstract public class Car {
	IEngine engine;
	
	public void start(){
		engine = getEngine();
		engine.run();
		System.out.println("car is running.....");	
	}
	
	//lookup method
	abstract public IEngine getEngine();
}
