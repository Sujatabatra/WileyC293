package com.sujata.demo;

class Outer{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	/*private*/ class Inner{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
		
		public void display() {
			System.out.println("value : "+value);
			System.out.println("name : "+name);
		}
	}
	
	public void show() {
		System.out.println("value : "+value);
//		System.out.println("name : "+name);
	}
}
public class FirstInnerClassDemo {

	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		
		inner.setName("Sujata");
		outer.setValue(10);
		
		inner.display();

	}

}
