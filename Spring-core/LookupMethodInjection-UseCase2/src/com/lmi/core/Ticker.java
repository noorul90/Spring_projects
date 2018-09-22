package com.lmi.core;

public class Ticker{

	private static Ticker instance;
	//private int seconds;
	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
	
	private Ticker(){
		//no-op
	}
	
	public static synchronized Ticker getInstance(){
		if(instance==null){
			instance = new Ticker();
		}
		return instance;
	}
	
	public int oscillate(){	
		int seconds=0;
		//first execution of thread
		if(threadLocal.get()==null){
			seconds=0;
		}else{
			seconds=threadLocal.get();
		}
		seconds++;
		threadLocal.set(seconds);
		return seconds;
	}
					
}
