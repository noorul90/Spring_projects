package com.jpw.dto;

import java.io.Serializable;

public class JourneyDto implements Serializable {
	private int journeyId;
	private String busType;
	private float price;
	//setters & getters
	public int getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
