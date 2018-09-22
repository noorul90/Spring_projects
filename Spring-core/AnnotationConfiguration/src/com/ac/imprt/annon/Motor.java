package com.ac.imprt.annon;

import org.springframework.beans.factory.annotation.Autowired;

public class Motor {
	private Chain chain;

	//@Autowired
	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Motor [chain=" + chain + "]";
	}
	
}
