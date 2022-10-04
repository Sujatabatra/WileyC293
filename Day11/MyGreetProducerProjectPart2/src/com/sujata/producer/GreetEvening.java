package com.sujata.producer;

public class GreetEvening implements Greet {

	private String name;

	public GreetEvening(String name) {
		super();
		this.name = name;
	}

	@Override
	public void wish() {
		System.out.println("Good Evening " + name);

	}

}
