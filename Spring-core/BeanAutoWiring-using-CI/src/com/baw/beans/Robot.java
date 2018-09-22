/** 
 * if multiple constructor definition found then in this
 * case maximum arg constructor have highest priority to call first
 * and if any two or more than two constructor having same numbers of 
 * argument then priority is given to in order of constructor is define 
 * means which constructor define last have highest priority
 */

package com.baw.beans;

public class Robot {
	
	private Chip chip;
	private Sensor sensor;
	private AdvanceChip advChip;

	//single arg constructor(priority-5)
	public Robot(Chip chip) {
		super();
		this.chip = chip;
	}
	
    
	
	//two arg constructor(priority-3)
	public Robot(Sensor sensor, AdvanceChip advChip) {
		super();
		this.sensor = sensor;
		this.advChip = advChip;
	}
	
	//two arg constructor(priority-4)
    public Robot(Chip chip, AdvanceChip advChip) {
		super();
		this.chip = chip;
		this.advChip = advChip;
	}
    
  //two arg constructor(priority-2)
  	public Robot(Chip chip, Sensor sensor) {
  		super();
  		this.chip = chip;
  		this.sensor = sensor;
  	}


 /*	//three arg constructor(priority-1)
	public Robot(Chip chip, Sensor sensor, AdvanceChip advChip) {
		super();
		this.chip = chip;
		this.sensor = sensor;
		this.advChip = advChip;
	}
 */
	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + ", advChip="
				+ advChip + "]";
	}
	

}
