package com.lmi.beans;

//Dependent class
public class RequestHandler {
	private String data;

	public void setData(String data) {
		this.data = data;
	}

	public void handle() {
		System.out.println("processed data with thread id:" + this.hashCode() + ", Data: " + data);
	}

}
