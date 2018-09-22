package com.si.beans;

import java.util.List;
import java.util.UUID;

public class DHLCourierImpl implements ICourier{

	public String sendCourier(List<String> product, String address) {
		
		return "dhl-" + UUID.randomUUID().toString();
	}
	
	

}
