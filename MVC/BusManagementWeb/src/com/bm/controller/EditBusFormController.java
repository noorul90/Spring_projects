package com.bm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.bm.dto.BusDto;
import com.bm.form.BusForm;
import com.bm.service.BusService;

public class EditBusFormController extends SimpleFormController{
	
	private BusService busSrvice;

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		BusForm busForm=null;
		ModelAndView mav=null;
		
		busForm=(BusForm)command;
		busSrvice.updateBus(busForm);
		
		mav=new ModelAndView();
		mav.setViewName("bus_edited_success");
		mav.addObject("busId",busForm.getBusId());
		
		return mav;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		int busId=0;
		BusDto busDto=null;
		BusForm busForm=null;
		
		busId=Integer.parseInt(request.getParameter("busId"));
		busDto=busSrvice.getBusById(busId);
		
		busForm=new BusForm();
		
		busForm.setBusId(busDto.getBusId());
		busForm.setRegdNo(busDto.getRegdNo());
		busForm.setServiceNo(busDto.getServiceNo());
		busForm.setBusType(busDto.getBusType());
		busForm.setSeatCapacity(busDto.getSeatCapacity());
		
		return busForm;
	}

	public void setBusSrvice(BusService busSrvice) {
		this.busSrvice = busSrvice;
	}

	
}
