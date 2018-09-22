package com.bauc.beans;

import java.util.List;

public class BlueDartCourierImpl implements ICourier {

	@Override
	public String sendCourier(List<String> product, Address add) {
		
		return "Product is sent to zip code " + add.getZip() + " by BlueDart";
	}
	
	

}
