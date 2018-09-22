package com.ara.beans;

public class KeyGenerator {
	public long generateKey(long len){
		if(len<=8){
			return 0;
		}
		return 1;
	}

}
