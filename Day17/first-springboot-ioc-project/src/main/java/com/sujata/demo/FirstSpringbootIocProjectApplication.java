package com.sujata.demo;

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
public class FirstSpringbootIocProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(FirstSpringbootIocProjectApplication.class, args);
	
		Performer singer1=(Performer)springContainer.getBean("Hamza");
		singer1.perform();
		
		Performer juggler=(Performer) springContainer.getBean("Rosalind");
		juggler.perform();
		
		Performer dancer=(Performer) springContainer.getBean("Sam");
		dancer.perform();
		
		Performer singer2=(Performer)springContainer.getBean("Charlie");
		singer2.perform();
	}
	
	@Bean(name = "Charlie")
	public Singer getSinger() {
		Singer singer=new Singer("NickelBack");
		return singer;
	}

}
