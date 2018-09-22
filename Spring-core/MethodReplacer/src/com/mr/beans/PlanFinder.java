package com.mr.beans;

public class PlanFinder {
	
	public String[] findPlans(int ageGroup, int coverageType, int networkType){
		return new String[]{"jeevan jyoti"};
	}
	
	//overloaded method
	public String[] findPlans(int ageGroup, int networkType){
		return new String[]{"LIC Gold"};
	}
}
