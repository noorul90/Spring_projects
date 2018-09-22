package com.fb.beans;

import java.util.Calendar;

public class Alarm {
	
	private Calendar calendar;
	
	public void sayTime(){
		System.out.println(calendar.getTime());
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	

}
