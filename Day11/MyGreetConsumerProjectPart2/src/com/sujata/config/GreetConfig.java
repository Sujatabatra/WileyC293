package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GreetEvening;
import com.sujata.producer.GreetMorning;

@Configuration
public class GreetConfig {

	/*
	 * Setter Injection
	 */
	@Bean("mrng")
	public GreetMorning getGreetMorning() {
		GreetMorning gm=new GreetMorning();
		gm.setName("Oliver");
		return gm;
	}
	
	/*
	 * Constructor Injection
	 */
	@Bean("eve")
	public GreetEvening getGreetEvening() {
		return new GreetEvening("Sam");
	}
}
