package com.aroundog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String myTest() {
		System.out.println("Test success !!");
		return null;
		
	}
	
}
