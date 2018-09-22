package com.ss.beans;

public class IndiaWeatherForecaster implements IWeatherForecaster {

	public String findWeather(String zip) {
		
		return "<IND>" + zip + "</IND>";
	}
	
	

}
