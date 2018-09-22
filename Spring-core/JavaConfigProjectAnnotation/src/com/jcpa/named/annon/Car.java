package com.jcpa.named.annon;

import javax.annotation.Resource;

public class Car {
	private Engine engine;

	/*@Inject
	@Named("engine2")*/
	@Resource(name="engine2")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}
