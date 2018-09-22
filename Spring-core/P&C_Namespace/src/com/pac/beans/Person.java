package com.pac.beans;

public class Person {
	
	private int ssn;
	private String name;
	private Address address;
	
	public Person(int ssn, String name, Address address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", address=" + address
				+ "]";
	}
	
}
