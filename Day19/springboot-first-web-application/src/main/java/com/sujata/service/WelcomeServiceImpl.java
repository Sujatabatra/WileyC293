package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String welcomeMessage() {
		
		return "Welcome to the world of Spring Boot MVC !";
	}

}
