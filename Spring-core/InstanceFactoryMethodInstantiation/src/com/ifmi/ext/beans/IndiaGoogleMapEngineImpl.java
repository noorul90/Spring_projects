package com.ifmi.ext.beans;

public class IndiaGoogleMapEngineImpl implements IGoogleMapEngine {

	@Override
	public String[] getDirection(String source, String dest) {
		
		return new String[]{"(ind-x1, ind-y1)", "(ind-x2, ind-y2)"};
	}

}
