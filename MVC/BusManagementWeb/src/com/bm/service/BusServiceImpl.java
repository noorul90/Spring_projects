package com.bm.service;

import java.util.ArrayList;
import java.util.List;

import com.bm.bo.BusBO;
import com.bm.dao.BusDao;
import com.bm.dto.BusDto;
import com.bm.form.BusForm;
import com.bm.mapper.BusMapper;

public class BusServiceImpl implements BusService{
	private BusDao busDao;
	private BusMapper busMapper;

	public List<BusDto> getAllBuses()
	{
		List<BusDto> busDtos=null;
		List<BusBO> busBOs=null;
		BusDto dto=null;
		
		busBOs=busDao.getAllBuses();
		
		busDtos=new ArrayList<BusDto>();
		
		for(BusBO bo:busBOs)
		{
			dto=busMapper.mapBusBoToBusDto(bo);
			busDtos.add(dto);
		}
		
		return busDtos;
	}
	
	public BusDto getBusById(int busId)
	{
		BusDto busDto=null;
		BusBO busBO=null;
		
		busBO=busDao.getBusById(busId);
		busDto=busMapper.mapBusBoToBusDto(busBO);
		
		return busDto;
	}
	
	public void updateBus(BusForm busForm)
	{
		BusBO busBO=null;
		busBO=busMapper.mapBusFormToBusBo(busForm);
		busDao.updateBus(busBO);
		
	}
	
	public void setBusDao(BusDao busDao) {
		this.busDao = busDao;
	}
	public void setBusMapper(BusMapper busMapper) {
		this.busMapper = busMapper;
	}
	
	
}
