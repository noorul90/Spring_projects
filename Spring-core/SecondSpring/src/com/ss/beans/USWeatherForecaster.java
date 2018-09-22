package com.ss.beans;

public class USWeatherForecaster implements IWeatherForecaster{

	public String findWeather(String zip) {
		
		return "<US>" + zip + "</US>";
	}
	
	

}
