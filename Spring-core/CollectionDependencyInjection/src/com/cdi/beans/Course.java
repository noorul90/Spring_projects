package com.cdi.beans;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Course {
	
	private List<String> subjects;
	private Set<String> faculties;
	private Properties facultySubjects;

	//using constructor injection in collection type List
	public Course(List<String> subjects) {
		
		this.subjects = subjects;
	}
	
	//using setter injection in collection type Set
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}
	
	//using setter injection on Collection type Properties
	 public void setFacultySubjects(Properties facultySubjects) {
			this.facultySubjects = facultySubjects;
		}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", faculties=" + faculties
				+ ", facultyCourse=" + facultySubjects + "]";
	}

	

}
