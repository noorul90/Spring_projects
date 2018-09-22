package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.IWeatherForecaster;
import com.ss.beans.WeatherFinder;

public class WeatherTest {

	
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ss/common/application-context.xml"));
		WeatherFinder wf = factory.getBean("weatherFinder", WeatherFinder.class);
		
		//IWeatherForecaster iwf = factory.getBean("indiaWeatherForecaster", IWeatherForecaster.class);
		//wf.setWeatherForecaster(iwf);
		
		wf.searchWeather("110034");

	}

}
