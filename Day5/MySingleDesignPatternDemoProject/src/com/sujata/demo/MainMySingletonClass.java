package com.sujata.demo;

public class MainMySingletonClass {

	public static void main(String[] args) {
		
		MySingletonClass obj1=MySingletonClass.getInstance();
		
		
		MySingletonClass obj2=MySingletonClass.getInstance();
		
		MySingletonClass obj3=MySingletonClass.getInstance();

		MySingletonClass obj4=MySingletonClass.getInstance();
	
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
	}

}
