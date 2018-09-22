package com.bm.dao;

import java.util.List;

import com.bm.bo.BusBO;

public interface BusDao {
	public List<BusBO> getAllBuses();
	public BusBO getBusById(int busId);
	public void updateBus(BusBO busBO);
}
