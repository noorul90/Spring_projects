package com.jpw.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AvailableJourneysDto implements Serializable {
	private String source;
	private String dest;
	private Date journeyDate;
	private List<JourneyDto> journeys;
	//setters & getters
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public List<JourneyDto> getJourneys() {
		return journeys;
	}
	public void setJourneys(List<JourneyDto> journeys) {
		this.journeys = journeys;
	}

}
