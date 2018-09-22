package com.taw.command;

public class NewBusCommand {
	//attribute name must be same as input control name of new_bus.jsp page
	protected String srvcno;
	protected String regno;
	protected String bustype;
	protected int seatcap;
	//setters & gettes
	public String getSrvcno() {
		return srvcno;
	}
	public void setSrvcno(String srvcno) {
		this.srvcno = srvcno;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public int getSeatcap() {
		return seatcap;
	}
	public void setSeatcap(int seatcap) {
		this.seatcap = seatcap;
	}

}
