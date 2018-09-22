package com.na.beans;

import java.beans.ConstructorProperties;

public class House {
	
	private int houseNo;
	private String houseName;
	private int streetNo;
	private long depth;
	
	@ConstructorProperties({"houseNo" , "houseName"})
	public House(int houseNo, String houseName) {
		this.houseNo = houseNo;
		this.houseName = houseName;
	}
    
	@ConstructorProperties({"houseName" , "streetNo"})
	public House(String houseName, int streetNo) {
		this.houseName = houseName;
		this.streetNo = streetNo;
	}

	@ConstructorProperties({"houseName" , "depth"})
	public House(String houseName, long depth) {
		this.houseName = houseName;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "House [houseNo=" + houseNo + ", houseName=" + houseName
				+ ", streetNo=" + streetNo + ", depth=" + depth + "]";
	}
	
	
	
	
	
	

}
