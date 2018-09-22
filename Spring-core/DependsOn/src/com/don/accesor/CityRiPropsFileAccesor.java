package com.don.accesor;

import java.io.IOException;
import java.util.Properties;

public class CityRiPropsFileAccesor implements IAccesor {

	private String key;
	
	@Override
	public Object getData()throws IOException {
		
		Properties props=null;
		props=new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("city_ri.properties"));
		return props;	
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public void setKey(String key) {
		this.key=key;
	}
	
}
