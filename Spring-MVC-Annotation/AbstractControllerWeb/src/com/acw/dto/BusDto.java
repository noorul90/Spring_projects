package com.acw.dto;

public class BusDto {
	private String serviceNo;
	private String regNo;
	private String busType;
	private int capacity;
	
	//no-arg constructor
	public BusDto() {
		super();
	}

	/*//constructor
	public BusDto(String serviceNo, String regNo, String busType, int capacity) {
		this.serviceNo = serviceNo;
		this.regNo = regNo;
		this.busType = busType;
		this.capacity = capacity;
	}*/
	
	//setters & getters
	public String getServiceNo() {
		return serviceNo;
	}
	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
