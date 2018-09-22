package com.lmi.beans;

//Target Class
abstract public class WebContainer {
	
	public void process(String data){
		RequestHandler rh = getRequestHandler();
		rh.setData(data);
		rh.handle();	
	}
	
	//lookup method
	abstract public RequestHandler getRequestHandler();

}
