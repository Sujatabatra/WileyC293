package com.sujata.demo;

//POJO : Plain Old Java Object
public class EggUnit {

	private int gross,dozen,remaining;
	
	public EggUnit() {
		
	}
	
	public EggUnit(int gross, int dozen, int remaining) {
		this.gross = gross;
		this.dozen = dozen;
		this.remaining = remaining;
	}

	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozen() {
		return dozen;
	}

	public void setDozen(int dozen) {
		this.dozen = dozen;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	
	
	
}
