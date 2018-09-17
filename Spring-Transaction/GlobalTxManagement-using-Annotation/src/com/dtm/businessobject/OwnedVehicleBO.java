package com.dtm.businessobject;

import java.util.Date;

public class OwnedVehicleBO {
	private int vehicleId;
	private int ownerId;
	private String registrationNo;
	private String chachisNo;
	private String engineNo;
	private Date purchseDate;
	private Date dateOfRegistration;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getChachisNo() {
		return chachisNo;
	}
	public void setChachisNo(String chachisNo) {
		this.chachisNo = chachisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public Date getPurchseDate() {
		return purchseDate;
	}
	public void setPurchseDate(Date purchseDate) {
		this.purchseDate = purchseDate;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	

}
