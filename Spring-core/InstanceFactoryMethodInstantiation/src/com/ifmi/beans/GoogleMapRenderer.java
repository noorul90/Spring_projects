package com.ifmi.beans;

import com.ifmi.ext.beans.IGoogleMapEngine;

public class GoogleMapRenderer {
	
	private IGoogleMapEngine googleMapEngine;
	private String[] direction=null;
	
	
	public void setGoogleMapEngine(IGoogleMapEngine googleMapEngine) {
		this.googleMapEngine = googleMapEngine;
	}


	public void renderMap(String source, String dest){
		
		direction = googleMapEngine.getDirection(source, dest);
		for(String d : direction){
		System.out.println(d);
		}	
	}

}
