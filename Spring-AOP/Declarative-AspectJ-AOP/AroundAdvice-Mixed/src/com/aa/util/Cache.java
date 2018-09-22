package com.aa.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Map<String, Object> dataMap;

	public Cache() {
		dataMap = new ConcurrentHashMap<String, Object>();
	}

	/*
	 * here no need to write the logic to make class as singleton because
	 * whenever we declare this class as bean in spring bean config file
	 * bydefault this class becomes singleton because default scope is singleton
	 */

	public void put(String key, Object val) {
		dataMap.put(key, val);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containskey(String key) {
		return dataMap.containsKey(key);
	}

}