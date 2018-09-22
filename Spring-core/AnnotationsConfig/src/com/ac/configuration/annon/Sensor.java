package com.ac.configuration.annon;

public class Sensor {
	
	private int id;
	private String type;
	
	public Sensor(){
		System.out.println("Sensor().....");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Sensor [id=" + id + ", type=" + type + "]";
	}
	
}
