package com.qjw.dto;

import java.io.Serializable;
import java.util.Date;
//display information
public class JourneyDTO implements Serializable {
	private String source;
	private String destination;
	private Date journeyDate;
	//setters & getters
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

}
