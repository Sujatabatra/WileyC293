package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.User;



@SpringBootApplication(scanBasePackages = "com.sujata")

public class SpringbootEmployeeLayeredWebApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeLayeredWebApplication.class, args);
		
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
