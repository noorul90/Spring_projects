package com.ci.beans;

import java.util.List;

public class OrderProcessor {
	
	private ICourier courier;
	String awbno=null;
	
	public OrderProcessor(ICourier courier) {
		super();
		this.courier = courier;
	}

	public void checkOut(List<String> product, String address){
		
		awbno = courier.sendCourier(product, address);
		System.out.println(awbno);
		
	}

}
