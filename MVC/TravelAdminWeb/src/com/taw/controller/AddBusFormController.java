package com.taw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.taw.command.NewBusCommand;

public class AddBusFormController extends SimpleFormController {

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mav=null;
		NewBusCommand nbCommand=null;
		nbCommand = (NewBusCommand)command;
		mav = new ModelAndView();
		mav.addObject("busId", nbCommand.getSrvcno());
		mav.setViewName("bus_added_suc");
		
		return mav;
	}
	

}
