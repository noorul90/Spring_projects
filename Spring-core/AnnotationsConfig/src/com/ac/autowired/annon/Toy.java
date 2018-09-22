package com.ac.autowired.annon;

import org.springframework.beans.factory.annotation.Autowired;

public class Toy {
	private Sensor sensor;
	private Chip chip;

	@Autowired(required=false)
	public Toy(Sensor sensor) {
		super();
		this.sensor = sensor;
	}

	@Autowired(required=false)
	public Toy(Sensor sensor, Chip chip) {
		super();
		this.sensor = sensor;
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Toy [sensor=" + sensor + ", chip=" + chip + "]";
	}
	
	
}
