package com.ci.beans;

import java.util.List;
import java.util.UUID;

public class BluedartCourierImpl implements ICourier {

	public String sendCourier(List<String> product, String address) {

		return "bluedart-" + UUID.randomUUID().toString();
	}
	
	

}
