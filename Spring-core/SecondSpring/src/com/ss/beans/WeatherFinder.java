package com.ss.beans;

public class WeatherFinder {
	
	private IWeatherForecaster weatherForecaster;
	public void searchWeather(String zip){
		
		String findData = weatherForecaster.findWeather(zip);
		System.out.println(findData);
	}
	
	//generate setter
	public void setWeatherForecaster(IWeatherForecaster weatherForecaster) {
		this.weatherForecaster = weatherForecaster;
	}
	
	

}
