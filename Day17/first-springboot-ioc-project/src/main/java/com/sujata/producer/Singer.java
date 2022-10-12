package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Hamza")
public class Singer implements Performer {

	private String song;

	public Singer(@Value("Happy Birthday") String song) {
		super();
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing "+song+"!");

	}

}
