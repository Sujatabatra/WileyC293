package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

/*
 * @SpringBootApplication : @Configuration + @ComponentScan
 */
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class FirstSpringbootIocProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Hamza")
	Performer singer1;
	

	@Autowired
	@Qualifier("Rosalind")
	Performer juggler;
	
	@Autowired
	@Qualifier("Sam")
	Performer dancer;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootIocProjectApplication.class, args);
	

	}
	

	@Override
	public void run(String... args) throws Exception {
		singer1.perform();
		juggler.perform();
		dancer.perform();
		
	}

}
