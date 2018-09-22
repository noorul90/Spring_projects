package com.ba.beans;

public class Person {
	
	private int ssn;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", gender=" + gender + "]";
	}
	
	
}
