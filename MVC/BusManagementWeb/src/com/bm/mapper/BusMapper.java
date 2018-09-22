package com.bm.mapper;

import com.bm.bo.BusBO;
import com.bm.dto.BusDto;
import com.bm.form.BusForm;

public class BusMapper {

	public BusDto mapBusBoToBusDto(BusBO bo)
	{
		BusDto dto=new BusDto();
		dto.setBusId(bo.getBusId());
		dto.setBusType(bo.getBusType());
		dto.setRegdNo(bo.getRegdNo());
		dto.setServiceNo(bo.getServiceNo());
		dto.setSeatCapacity(bo.getSeatCapacity());
		
		return dto;
		
	}
	
	public BusBO mapBusFormToBusBo(BusForm busForm)
	{
		BusBO busBO=null;
		
		busBO=new BusBO();
		
		busBO.setBusId(busForm.getBusId());
		busBO.setBusType(busForm.getBusType());
		busBO.setRegdNo(busForm.getRegdNo());
		busBO.setSeatCapacity(busForm.getSeatCapacity());
		busBO.setServiceNo(busForm.getServiceNo());
		
		return busBO;
	}
}
