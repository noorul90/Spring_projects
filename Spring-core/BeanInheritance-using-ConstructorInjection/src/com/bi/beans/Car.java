package com.bi.beans;

import java.beans.ConstructorProperties;

public class Car {
	
	private int id;
	private String name;
	private String model;
	private String color;
	private int capacity;
	
	@ConstructorProperties({"id","name","model","color","capacity"})
	public Car(int id, String name, String model, String color, int capacity) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model
				+ ", color=" + color + ", capacity=" + capacity + "]";
	}
	
	
	
	
}
