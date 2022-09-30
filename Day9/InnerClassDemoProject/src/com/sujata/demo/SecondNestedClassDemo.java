package com.sujata.demo;

class MyOuter{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	/*private*/ static class MyInner{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
		
		public void display() {
//			System.out.println("value : "+value);
			System.out.println("name : "+name);
		}
	}
	
	public void show() {
		System.out.println("value : "+value);
//		System.out.println("name : "+name);
	}
}
public class SecondNestedClassDemo {

	public static void main(String[] args) {
		MyOuter outer=new MyOuter();
		MyOuter.MyInner inner=new MyOuter.MyInner();
		
		inner.setName("Sujata");
		outer.setValue(10);
		
		inner.display();

	}

}
