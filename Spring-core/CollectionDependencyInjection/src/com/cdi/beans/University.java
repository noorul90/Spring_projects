package com.cdi.beans;

import java.util.Map;

public class University {
	
	private Map<String, Course> hodByDept;

	public void setHodByDept(Map<String, Course> hodByDept) {
		this.hodByDept = hodByDept;
	}

	@Override
	public String toString() {
		return "University [hodByDept=" + hodByDept + "]";
	}

	
	
	
	
	
	
	

}
