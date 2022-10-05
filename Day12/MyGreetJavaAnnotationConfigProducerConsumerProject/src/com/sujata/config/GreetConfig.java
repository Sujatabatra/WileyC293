package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GreetEvening;
import com.sujata.producer.GreetMorning;

@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class GreetConfig {


	
}
