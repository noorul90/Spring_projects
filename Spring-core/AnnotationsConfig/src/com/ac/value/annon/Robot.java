package com.ac.value.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	//@Value("50")
	@Value("#{appValues.Robot_id}")
	private int id;
	
	//@Value("ios")
	@Value("#{appValues.Robot_type}")
	private String type;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + "]";
	}

}
