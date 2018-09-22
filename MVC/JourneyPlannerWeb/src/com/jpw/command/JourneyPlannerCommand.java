package com.jpw.command;

import java.io.Serializable;
import java.util.Date;

public class JourneyPlannerCommand implements Serializable {
	//variable name must be matched with input control name of jsp page
	protected String src;
	protected String dest;
	protected Date jdate;
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}

}
