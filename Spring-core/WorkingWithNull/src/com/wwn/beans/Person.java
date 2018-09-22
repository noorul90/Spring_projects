package com.wwn.beans;

public class Person {
	
	private String ssn;
	private String name;
	
	//mandatory attribute
	public Person(String ssn) {
		this.ssn = ssn;
	}

	//optional attribute
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + "]";
	}
	
}
