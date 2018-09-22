package com.pac.beans;

public class Address {
	
	private int houseNo;
	private int streetNo;
	private int zip;
	private String city;
	private String state;
	private String country;
	
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setStreetName(int streetNo) {
		this.streetNo = streetNo;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetNo=" + streetNo
				+ ", zip=" + zip + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
}
