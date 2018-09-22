package com.baw.beans;

public class Robot {
	
	private Chip chip;
	private Sensor sensor;
	private AdvanceChip advChip;
	
	public void setChip(Chip chip) {
		this.chip = chip;
	}
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	public void setAdvChip(AdvanceChip advChip) {
		this.advChip = advChip;
	}
	
	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + ", advChip="
				+ advChip + "]";
	}
	
	

	
}
