package com.cdi.beans;

import java.util.Map;

public class Course {
	
	private Map<String, String> hodByDeptno;

	public void setHodByDeptno(Map<String, String> hodByDeptno) {
		this.hodByDeptno = hodByDeptno;
	}

	@Override
	public String toString() {
		return "Course [hodByDeptno=" + hodByDeptno + "]";
	}
	
	

}
