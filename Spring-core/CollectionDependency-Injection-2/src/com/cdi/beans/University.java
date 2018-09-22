package com.cdi.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class University {
	private List<String> subjects;
	private Set<String> faculties;
	private Map<String , Course> topperClassMap;

	public void setTopperClassMap(Map<String, Course> topperClassMap) {
		this.topperClassMap = topperClassMap;
	}

	@Override
	public String toString() {
		return "University [subjects=" + subjects + ", faculties=" + faculties
				+ ", topperClassMap=" + topperClassMap + "]";
	}

	
	
	

}
