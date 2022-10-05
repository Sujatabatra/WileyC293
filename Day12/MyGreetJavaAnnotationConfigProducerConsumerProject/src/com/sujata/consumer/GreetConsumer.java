package com.sujata.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.config.GreetConfig;
import com.sujata.producer.Greet;

public class GreetConsumer {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContainer;
		springContainer=new AnnotationConfigApplicationContext(GreetConfig.class);
		
		
		Greet greet1=(Greet)springContainer.getBean("eve");
		greet1.wish();

	}

}
