package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GreetEvening;
import com.sujata.producer.GreetMorning;

@Configuration
public class GreetConfig {

	@Bean("mrng")
	public GreetMorning getGreetMorning() {
		return new GreetMorning();
	}
	
	@Bean("eve")
	public GreetEvening getGreetEvening() {
		return new GreetEvening();
	}
}
