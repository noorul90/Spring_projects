package com.ac.mixed.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("#{appVal.Course_id}")
	private int id;
	
	@Value("#{appVal.Course_name}")
	private String name;
	
	public Course(){
		System.out.println("Course().....");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
