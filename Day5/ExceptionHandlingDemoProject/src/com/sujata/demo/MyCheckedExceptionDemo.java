package com.sujata.demo;

public class MyCheckedExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Hi I am going to rest for 2000 milisecond!");
		try {
		Thread.sleep(2000);
		}
		//checked exception
		catch(InterruptedException exception) {
			exception.printStackTrace();
		}
		System.out.println("HI Everyone i woke up!");
	}

}
