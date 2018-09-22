package com.ac.imprt.annon;

import org.springframework.beans.factory.annotation.Value;

public class Chain {
	@Value(("#{appProps.Chain_id}"))
	private int id;
	@Value("#{appProps.Chain_manufacturer}")
	private String manufacturer;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Chain [id=" + id + ", manufacturer=" + manufacturer + "]";
	}

}
