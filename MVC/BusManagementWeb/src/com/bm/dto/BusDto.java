package com.bm.dto;

public class BusDto {
	private int busId;
	private String serviceNo;
	private String regdNo;
	private String busType;
	private int seatCapacity;
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getServiceNo() {
		return serviceNo;
	}
	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}
	public String getRegdNo() {
		return regdNo;
	}
	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
