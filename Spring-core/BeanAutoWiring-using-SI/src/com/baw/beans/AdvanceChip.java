package com.baw.beans;

public class AdvanceChip {
	
	private String advChipNo;
	private String advChipType;
	private String manufacturer;
	
	public void setAdvChipNo(String advChipNo) {
		this.advChipNo = advChipNo;
	}
	public void setAdvChipType(String advChipType) {
		this.advChipType = advChipType;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "AdvanceChip [advChipNo=" + advChipNo + ", advChipType="
				+ advChipType + ", manufacturer=" + manufacturer + "]";
	}

}
