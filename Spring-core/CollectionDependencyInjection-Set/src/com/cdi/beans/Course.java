package com.cdi.beans;

import java.util.Set;

public class Course {
	
	
	private Set<String> faculties;
	
	//using setter injection in collection type Set
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}

	@Override
	public String toString() {
		return "Course [faculties=" + faculties + "]";
	}

	

}
