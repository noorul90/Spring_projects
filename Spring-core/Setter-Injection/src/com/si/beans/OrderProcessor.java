package com.si.beans;

import java.util.List;

public class OrderProcessor {
	
	private ICourier courier;
	String awhno=null;
	
	public void checkOut(List<String> product, String address){
		
		awhno = courier.sendCourier(product, address);
		System.out.println(awhno);
		
	}
	public void setCourier(ICourier courier) {
		this.courier = courier;
	}
	
	

}
