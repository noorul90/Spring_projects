package com.dc.beans;

public class Passport {
	
	private int passportNo;
	private String passportHolderName;

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	
	public void setPassportHolderName(String passportHolderName) {
		this.passportHolderName = passportHolderName;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", passportHolderName="
				+ passportHolderName + "]";
	}
	
	
	
	

}
