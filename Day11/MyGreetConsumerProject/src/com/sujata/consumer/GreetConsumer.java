package com.sujata.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.config.GreetConfig;
import com.sujata.producer.Greet;

public class GreetConsumer {

	public static void main(String[] args) {
		/*
		 * While being the consumer of component,
		 * need not to create component , 
		 * as Spring Container will maintain life cycle of component for you.
		 */
		/*
		 * Spring container reads configuration class(class annotated with @Configuration),
		 * read all configurations for all the components and maintain lifecycle for all the components.
		 */
		AnnotationConfigApplicationContext springContainer;
		springContainer=new AnnotationConfigApplicationContext(GreetConfig.class);
		
		/*
		 * IOC : Inversion of control : Seperating the dependecy logic from the actual business logic of you application
		 */
		Greet greet1=(Greet)springContainer.getBean("eve");
		greet1.wish("Sam");

	}

}
