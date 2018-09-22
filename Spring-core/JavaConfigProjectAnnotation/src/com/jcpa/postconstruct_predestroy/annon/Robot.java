package com.jcpa.postconstruct_predestroy.annon;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

public class Robot {
	private Sensor sensor;
	
	@PostConstruct
	public void init(){
		System.out.println("initializing.......");
	}

	@Inject
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	@PreDestroy
	public void release(){
		System.out.println("releasing.....");
	}

	@Override
	public String toString() {
		return "Robot [sensor=" + sensor + "]";
	}

}
