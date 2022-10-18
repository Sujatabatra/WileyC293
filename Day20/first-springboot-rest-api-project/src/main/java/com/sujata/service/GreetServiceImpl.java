package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService {

	@Override
	public String wish() {
		return "Welcome to the world of Rest API!";
	}

	@Override
	public String welcome(String name) {
		
		return "Welcome "+name+"!!!";
	}

}
