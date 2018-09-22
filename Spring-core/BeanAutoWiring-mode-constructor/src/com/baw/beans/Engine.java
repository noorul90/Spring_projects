package com.baw.beans;

public class Engine {
	
	private int engineNo;
	private String engineType;
	
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", engineType=" + engineType
				+ "]";
	}
	
}
