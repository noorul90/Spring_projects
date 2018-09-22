package com.acw.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acw.dto.BusDto;

@Controller
public class ListBusController {
	//Method-1
	/*@RequestMapping("/buses.htm")
	public ModelAndView listBuses(){
		
		ModelAndView mav = null;
		List<BusDto> buses = getBuses();
		mav = new ModelAndView();
		mav.addObject("buses", buses);
		mav.setViewName("buses");
		
		return mav;  //logical view name
		
	}*/
	
	//Method-2
	@RequestMapping("/buses.htm")
	public String listBuses(Model model){
		List<BusDto> dtos =null;
		dtos = getBuses();
		model.addAttribute("buses", dtos);
		return "buses";
	}
	
	/*//Method-3
	public String listBuses(Map<String,Object> modelMap){
		//logic
	}
	
	//Method-4
	public String listBuses(ModelMap model){
		//logic
	}
	
	//Method-5
	public void listBuses(model model){
		//logic
	}*/
	
	private List<BusDto> getBuses(){
		List<BusDto> bdtos = null;
		bdtos = new ArrayList<BusDto>();
		for(int i=0; i<10; i++){
			BusDto dto = new BusDto();
			dto.setServiceNo("S120"+i);
			dto.setRegNo("TS102"+i);
			dto.setBusType("Sleeper");
			dto.setCapacity(40);
			bdtos.add(dto);
		}
		
		return bdtos;
	}

}
