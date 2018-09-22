package com.jpw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.jpw.command.JourneyPlannerCommand;
import com.jpw.dto.AvailableJourneysDto;
import com.jpw.dto.JourneyDto;

public class GetAvailableJourneyCommandController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException be)
			throws Exception {
		JourneyPlannerCommand jpcommand=null;
		jpcommand =(JourneyPlannerCommand)command;
		
		AvailableJourneysDto ajdto = null;
		List<JourneyDto> journeys=null;
		
		ajdto = new AvailableJourneysDto();
		ajdto.setSource(jpcommand.getSrc());
		ajdto.setDest(jpcommand.getDest());
		ajdto.setJourneyDate(jpcommand.getJdate());
		
		journeys = new ArrayList<JourneyDto>();
		JourneyDto dto = new JourneyDto();
		dto.setJourneyId(1);
		dto.setBusType("super luxury");
		dto.setPrice(250.0f);
		
		journeys.add(dto);
		
		dto = new JourneyDto();
		dto.setJourneyId(2);
		dto.setBusType("semi-super luxury");
		dto.setPrice(450.8f);
		
		journeys.add(dto);
		
		dto = new JourneyDto();
		dto.setJourneyId(3);
		dto.setBusType("AC sleeper");
		dto.setPrice(880.2f);
		
		journeys.add(dto);
		
		dto = new JourneyDto();
		dto.setJourneyId(4);
		dto.setBusType("AC seater");
		dto.setPrice(660.8f);
		
		journeys.add(dto);
		
		//set the journeys object
		ajdto.setJourneys(journeys);
		
		ModelAndView mav=null;
		mav = new ModelAndView();
		mav.setViewName("matching_journey");
		mav.addObject("availableJourneys", ajdto);
		
		return mav;
	}
	

}
