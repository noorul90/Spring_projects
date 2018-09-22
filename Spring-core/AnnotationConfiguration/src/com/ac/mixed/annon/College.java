package com.ac.mixed.annon;

public class College {
	private Course course;

	public College(){
		System.out.println("College().....");
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "College [course=" + course + "]";
	}

}
