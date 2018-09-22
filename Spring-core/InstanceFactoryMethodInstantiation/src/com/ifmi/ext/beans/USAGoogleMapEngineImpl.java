package com.ifmi.ext.beans;

public class USAGoogleMapEngineImpl implements IGoogleMapEngine {

	@Override
	public String[] getDirection(String source, String dest) {

		return new String[]{"(usa-x1, usa-y1)", "(usa-x2, usa-y2)"};
	}
	
	

}
