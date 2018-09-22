package com.bi.beans;

public class Bus {
	
	private int id;
	private String name;
	private String model;
	private String color;
	private int capacity;
	private String type;
	
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
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", model=" + model
				+ ", color=" + color + ", capacity=" + capacity + ", type="
				+ type + "]";
	}
	
	
	
	

}
