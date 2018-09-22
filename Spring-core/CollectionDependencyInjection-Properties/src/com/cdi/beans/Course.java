package com.cdi.beans;

import java.util.Properties;

public class Course {

	private Properties facultySubjects;

	//using setter injection on Collection type Properties
	 public void setFacultySubjects(Properties facultySubjects) {
			this.facultySubjects = facultySubjects;
		}

	@Override
	public String toString() {
		return "Course [facultySubjects=" + facultySubjects + "]";
	}

}
