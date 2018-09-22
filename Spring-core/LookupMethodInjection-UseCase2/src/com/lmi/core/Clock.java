package com.lmi.core;

public class Clock implements Runnable {
	Ticker ticker;

	@Override
	public void run() {

		for(int i=0; i<1000; i++){
			ticker = Ticker.getInstance();
			int seconds = ticker.oscillate();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"- "+seconds+" second");
		}
	}
	
}
