package com.pi.beans;

public class Address {
		
		//class properties
		private String addressLine1;
		private String addressLine2;
		private String street;
		private String city;
		private String state;
		private int zip;
		
		//setters
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		
		//getters
		public String getAddressLine1() {
			return addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public String getStreet() {
			return street;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public int getZip() {
			return zip;
		}
		
		
}
