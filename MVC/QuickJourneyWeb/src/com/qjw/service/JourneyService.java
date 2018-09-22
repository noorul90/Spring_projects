package com.qjw.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.qjw.bo.JourneyBO;
import com.qjw.dao.JourneyDAO;
import com.qjw.dto.JourneyDTO;

public class JourneyService {
	private JourneyDAO jdao;
	
	public void setJdao(JourneyDAO jdao) {
		this.jdao = jdao;
	}

	public List<JourneyDTO> getNext7DaysJourneys(){
		Calendar cal=null;
		List<JourneyBO> jbos=null;
		List<JourneyDTO> jdtos=null;
		Date beforeDate=null;
		
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 7);
		//System.out.println(cal.getTime());
		beforeDate = cal.getTime();
		jbos = jdao.getJourneysBeforeDate(beforeDate);
		for(JourneyBO jbo : jbos){
			jdtos = new ArrayList<JourneyDTO>();
			JourneyDTO dto = new JourneyDTO();
			dto.setSource(jbo.getSource());
			dto.setDestination(jbo.getDest());
			dto.setJourneyDate(jbo.getJourneyDate());
			jdtos.add(dto);
		}
		return jdtos;
	}

}
