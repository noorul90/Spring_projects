package com.bi.beans;

import java.beans.ConstructorProperties;

public class Bus {
	
	private int id;
	private String name;
	private String model;
	private String color;
	private int capacity;
	private String type;
	
	@ConstructorProperties({"id","name","model","color","capacity","type"})
	public Bus(int id, String name, String model, String color, int capacity,
			String type) {
		
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", model=" + model
				+ ", color=" + color + ", capacity=" + capacity + ", type="
				+ type + "]";
	}
	
}
