package com.cdi.beans;

import java.util.List;

public class Course {
	
	private List<String> subjects;

	public Course(List<String> subjects) {
		
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + "]";
	}
	
	

}
