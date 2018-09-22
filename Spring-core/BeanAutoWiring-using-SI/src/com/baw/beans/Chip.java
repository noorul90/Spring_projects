package com.baw.beans;

public class Chip {
	
	private int chipNo;
	private String chipType;
	private String manufacturer;
	
	public void setChipNo(int chipNo) {
		this.chipNo = chipNo;
	}
	public void setChipType(String chipType) {
		this.chipType = chipType;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", chipType=" + chipType
				+ ", manufacturer=" + manufacturer + "]";
	}

}
