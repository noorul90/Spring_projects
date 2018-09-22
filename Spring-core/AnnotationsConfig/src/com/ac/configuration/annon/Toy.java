package com.ac.configuration.annon;

public class Toy {
	private Sensor sensor;

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	//Bean lifeCycle method
	public void init(){
		System.out.println("Initializing......");
	}

	@Override
	public String toString() {
		return "Toy [sensor=" + sensor + "]";
	}
	
	//Bean lifeCycle method
	public void destroy(){
		System.out.println("releasing........");
	}


	/*public Sensor getSensorObj() {
		Sensor sensor = new Sensor();
		sensor.setId(20);
		sensor.setType("Infrared");
		return sensor;
	}
*/
}
