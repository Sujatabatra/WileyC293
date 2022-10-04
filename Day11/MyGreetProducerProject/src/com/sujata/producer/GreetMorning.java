package com.sujata.producer;

public class GreetMorning implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Morning "+name);

	}

}
