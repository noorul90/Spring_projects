package com.lmi.test;

import com.lmi.core.Clock;

public class ClockTest {

	public static void main(String[] args) {
		Clock clk1 = new Clock();
		
		Thread t1 = new Thread(clk1, "clock1");
		Thread t2 = new Thread(clk1, "clock2");
		
		t1.start();
		t2.start();
	}

}
