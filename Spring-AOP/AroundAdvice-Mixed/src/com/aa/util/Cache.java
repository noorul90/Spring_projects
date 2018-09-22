package com.aa.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Cache instance;
	private static Map<String, Object> dataMap;
	
	private Cache(){
		dataMap = new ConcurrentHashMap<String, Object>();
	}
	
	public static synchronized Cache getInstance(){
		if(instance == null){
			instance = new Cache();
		}
		return instance;
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
