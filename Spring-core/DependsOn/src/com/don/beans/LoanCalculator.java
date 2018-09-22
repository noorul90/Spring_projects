package com.don.beans;

import java.util.Properties;

import com.don.util.Cache;

public class LoanCalculator {
	private static final String KEY_CITY_RI = "city_ri";
	private Cache cache;
	
	//setter
	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public float calculate(int principal, int tenure, String city)
			throws Exception {
		float ri = 0.0f;
		float intAmt = 0.0f;
		Properties props = null;

		if (cache.containsKey(KEY_CITY_RI) == false) {
			throw new Exception("cache not initialized");
		}
		props = (Properties) cache.get(KEY_CITY_RI);

		if (props.containsKey(city) == false) {
			throw new Exception("city not found");
		}
		ri = Float.parseFloat(props.getProperty(city));
		intAmt = (principal * tenure * ri)/100;
		return intAmt;
	}

}
