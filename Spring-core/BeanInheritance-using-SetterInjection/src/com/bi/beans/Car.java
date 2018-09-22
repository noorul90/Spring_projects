package com.bi.beans;

public class Car {
	
	private int id;
	private String name;
	private String model;
	private String color;
	private int capacity;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model
				+ ", color=" + color + ", capacity=" + capacity + "]";
	}
	
	
	
	

}
