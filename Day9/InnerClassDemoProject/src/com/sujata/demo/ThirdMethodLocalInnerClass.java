package com.sujata.demo;

class OurOuter {

	public void someMethod() {
		int x = 10;

		class OurInner {
			private String name;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

		}
		
		OurInner ourInner=new OurInner();
		ourInner.setName("Sujata");
		System.out.println("x : "+x);
		System.out.println("name : "+ourInner.getName());

	}
}

public class ThirdMethodLocalInnerClass {

	public static void main(String[] args) {
		OurOuter ourOuter=new OurOuter();
		ourOuter.someMethod();

	}

}
