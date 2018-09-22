package com.ta.beans;

public class Person {

	private String name;
	private int age;
	
	public Person(String name) {
	
		this.name = name;
	}

	public Person(int age) {
	
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
