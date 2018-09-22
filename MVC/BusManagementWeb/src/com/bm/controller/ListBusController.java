package com.bm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bm.dto.BusDto;
import com.bm.service.BusService;

public class ListBusController extends AbstractController{

	private BusService busService;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		
		ModelAndView mav=null;
		List<BusDto> buses=null;
		
		buses=busService.getAllBuses();
		
		mav=new ModelAndView();
		mav.addObject("buses",buses);
		mav.setViewName("buses");
		
		return mav;
	}
	public void setBusService(BusService busService) {
		this.busService = busService;
	}
	
	

}
