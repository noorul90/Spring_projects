package com.ca.bo;

import java.io.Serializable;

public class StudentBO implements Serializable {
	private int studentId;
	private String name;
	
	public StudentBO(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentBO [studentId=" + studentId + ", name=" + name + "]";
	}
	
}
