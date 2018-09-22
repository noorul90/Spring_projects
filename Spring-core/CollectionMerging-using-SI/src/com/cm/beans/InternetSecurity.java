package com.cm.beans;

import java.util.List;

public class InternetSecurity {
	
	private List<String> features;

	//setter
	public void setFeatures(List<String> features) {
		this.features = features;
	}

	public String toString() {
		return "InternetSecurity [features=" + features + "]";
	}

}
