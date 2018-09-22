package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
	
	private int day;
	private int month;
	private int year;
	
	public CalendarFactoryBean(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public Calendar getObject() throws Exception {
        Calendar cal = null;
        cal = Calendar.getInstance();
        cal.set(year, month, day);
		return cal;
	}

	@Override
	public Class<?> getObjectType() {
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
