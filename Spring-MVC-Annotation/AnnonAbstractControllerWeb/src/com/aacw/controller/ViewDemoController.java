package com.aacw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewDemoController {
	
	@RequestMapping("/demo.htm")
	public String showDemo(){
		return "demo"; //logical name of view
	}

}
