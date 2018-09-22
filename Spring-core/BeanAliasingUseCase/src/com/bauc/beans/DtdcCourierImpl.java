package com.bauc.beans;

import java.util.List;

public class DtdcCourierImpl implements ICourier {

	@Override
	public String sendCourier(List<String> product, Address add) {
		
		return "product is sent to zip code "+ add.getZip() + " by DTDC";
	}
	
	

}
