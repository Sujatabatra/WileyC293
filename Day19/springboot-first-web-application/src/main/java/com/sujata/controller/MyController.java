package com.sujata.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.service.WelcomeService;

@Controller
public class MyController {

	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping("/first")  //Mapping Handler
	public ModelAndView firstController() {
		ModelAndView modelAndView=new ModelAndView();
		String msg=welcomeService.welcomeMessage();
		modelAndView.addObject("message", msg);
		modelAndView.setViewName("display");
		
		return modelAndView;
	}
	
	
	@RequestMapping("/my")  //Mapping Handler
	public ModelAndView secondController() {
		ModelAndView modelAndView=new ModelAndView();
		String msg=welcomeService.welcomeMessage();
		modelAndView.addObject("message", msg+new Date());
		modelAndView.setViewName("display");
		
		return modelAndView;
	}
}
