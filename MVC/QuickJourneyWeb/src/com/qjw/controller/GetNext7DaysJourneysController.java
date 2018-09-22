package com.qjw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.qjw.dto.JourneyDTO;
import com.qjw.service.JourneyService;

public class GetNext7DaysJourneysController extends AbstractController {
	private JourneyService jservice;

	public void setJservice(JourneyService jservice) {
		this.jservice = jservice;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<JourneyDTO> journeys=null;
		journeys = jservice.getNext7DaysJourneys();
		
		ModelAndView mav=null;
		mav = new ModelAndView();
		mav.setViewName("journey");
		mav.addObject("journey", journeys);
		
		return mav;
	}
	
}
