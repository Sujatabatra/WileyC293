package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

	@RequestMapping("/")
	public ModelAndView myMainPageController() {
		return new ModelAndView("MainPage");
	}
}
