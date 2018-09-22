package com.tsmw.dto;

import java.util.Date;

public class TicketDto {
	private String ticketNo;
	private String source;
	private String dest;
	private Date journeyDate;
	
	//constructor
	public TicketDto(String ticketNo, String source, String dest,
			Date journeyDate) {
		this.ticketNo = ticketNo;
		this.source = source;
		this.dest = dest;
		this.journeyDate = journeyDate;
	}
	
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
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

}
