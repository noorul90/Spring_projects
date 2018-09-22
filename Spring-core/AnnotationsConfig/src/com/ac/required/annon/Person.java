package com.ac.required.annon;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private int id;
	private String name;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}	

}
