package com.jcpa.inject_resource.annon;

import javax.annotation.Resource;

public class Car {
	private Engine engine;

	//@Inject
	@Resource
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}
