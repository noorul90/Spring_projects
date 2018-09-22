package com.bm.service;

import java.util.List;

import com.bm.dto.BusDto;
import com.bm.form.BusForm;

public interface BusService {

	public List<BusDto> getAllBuses();
	public BusDto getBusById(int busId);
	public void updateBus(BusForm busForm);
}
