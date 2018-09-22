package com.bauc.beans;

import java.util.List;


public class FlipKartStore {
	
	private ICourier bluedartCourier;
	private ICourier dtdcCourier;
	
	public void setBluedartCourier(ICourier bluedartCourier) {
		this.bluedartCourier = bluedartCourier;
	}

	public void setDtdcCourier(ICourier dtdcCourier) {
		this.dtdcCourier = dtdcCourier;
	}

	public void checkOut(List<String> product, Address add, Payment payDeatails){
		
		System.out.println("payment is done successfully");
		
		if(add.getZip()>=200000 && add.getZip()<=400000){
			String str = bluedartCourier.sendCourier(product, add);
			System.out.println(str);
			System.out.println("order dispatched successfully");
			
		}
		
		else{
			String str = dtdcCourier.sendCourier(product, add);
			System.out.println(str);
			System.out.println("order dispatched successfully");
		}

	}

}
