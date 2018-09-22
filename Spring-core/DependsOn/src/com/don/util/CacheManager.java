package com.don.util;

import java.util.List;

import com.don.accesor.IAccesor;

public class CacheManager {
	private Cache cache;
	private List<IAccesor> accesors;

	public CacheManager(Cache cache, List<IAccesor> accesors) {
		this.cache = cache;
		this.accesors = accesors;
		init();
	}

	public void init() {
		try {
			String key = null;
			Object val = null;
			for (IAccesor accesor : accesors) {
				key = accesor.getKey();
				val = accesor.getData();
				cache.put(key, val);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
