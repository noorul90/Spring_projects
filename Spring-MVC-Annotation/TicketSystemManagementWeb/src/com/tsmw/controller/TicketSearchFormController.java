package com.tsmw.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsmw.dto.TicketDto;
import com.tsmw.form.TicketSearchForm;

@Controller
public class TicketSearchFormController {

	@RequestMapping("/search-ticket.htm")
	public String doSearch(Model model, @ModelAttribute TicketSearchForm form, BindingResult errors){
		List<TicketDto> tickets=null;
		
		if(errors.hasErrors()){
			model.addAttribute("globalError", "errors");
			return "search-ticket";
		}
		
		tickets = new ArrayList<TicketDto>();
		tickets.add(new TicketDto(form.getTicketNo()+"TN", "Hyderabad", "Bangalore", new Date()));
		tickets.add(new TicketDto(form.getMobile(), "Hyderabad", "Pune", new Date()));
		
		model.addAttribute("ticketFound", tickets);
		
		return "ticket-found";
	}
}
