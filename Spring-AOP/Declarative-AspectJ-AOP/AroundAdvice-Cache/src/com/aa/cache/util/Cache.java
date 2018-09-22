package com.aa.cache.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Map<String, Object> dataMap;
	
	public Cache(){
		dataMap = new ConcurrentHashMap<String, Object>();
	}
	
	public void put(String key, Object val){
		dataMap.put(key, val);
	}
	
	public Object get(String key){
		return dataMap.get(key);
	}
	
	public boolean containskey(String key){
		return dataMap.containsKey(key);
	}

}