package com.ac.configuration.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name="sensor")
	//@Scope("prototype")
	//@Lazy
	public Sensor newSensor(){
		Sensor sensor = new Sensor();
		sensor.setId(10);
		sensor.setType("Android");
		return sensor;
	}
	
	@Bean(name="toy",autowire=Autowire.BY_TYPE, initMethod="init",destroyMethod="destroy")
	public Toy newToy(){
		Toy toy = new Toy();
		//toy.setSensor(toy.getSensorObj());
		return toy;
	}

}
