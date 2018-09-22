package com.ba.beans;

public class Person {
	
	private int ssn;
	private String firstName;
	private String lastName;
	private String gender;
	
	public Person(int ssn, String firstName, String lastName, String gender) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + "]";
	}
	
	
	
	
}
