package com.ifmi.util;

import com.ifmi.ext.beans.IGoogleMapEngine;
import com.ifmi.ext.beans.IndiaGoogleMapEngineImpl;
import com.ifmi.ext.beans.USAGoogleMapEngineImpl;

public class GoogleEngineServiceLocator {
	
	public IGoogleMapEngine getIndiaGoogleEngine(){
		
		//write lookup logic here and connect to jndi registry
		
		return new IndiaGoogleMapEngineImpl();
		
	}
	
	public IGoogleMapEngine getUsaGoogleEngine(){
		
		//write lookup logic and connect to jndi registry
		
		return new USAGoogleMapEngineImpl();
	}

}
