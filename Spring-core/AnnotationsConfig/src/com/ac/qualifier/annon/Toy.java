package com.ac.qualifier.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Toy {
	
	//@Autowired
	private Sensor sensor;

	/*@Autowired
	public Toy(Sensor sensor) {
		this.sensor = sensor;
	}*/


	@Autowired
	@Qualifier("irsensor")
	//@Qualifier("sensor2")  //not recomended bcoz when bean id will change then we need to it will not work
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Toy [sensor=" + sensor + "]";
	}

}
