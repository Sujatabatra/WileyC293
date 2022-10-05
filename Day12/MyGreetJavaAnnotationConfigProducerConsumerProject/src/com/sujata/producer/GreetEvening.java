package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eve")
public class GreetEvening implements Greet {

	private String name;

	public GreetEvening(@Value("Sam") String name) {
		super();
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Evening " + name);

	}

}
