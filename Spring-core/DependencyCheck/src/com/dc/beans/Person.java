package com.dc.beans;

public class Person {
	
	private String personName;
	private Passport passportDeatails;
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	/*public void setPassportDeatails(Passport passportDeatails) {
		this.passportDeatails = passportDeatails;
	}*/
	
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", passportDeatails="
				+ passportDeatails + "]";
	}
	
}
