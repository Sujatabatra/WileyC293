package com.sujata.demo;

class IntegerInput{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class StringInput{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class PersonInput{
	private Person value;

	public Person getValue() {
		return value;
	}

	public void setValue(Person value) {
		this.value = value;
	}
	
	
}

class GenericInput<T>{
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
public class FirstClass {

	public static void main(String[] args) {
		GenericInput<Integer> ob1=new GenericInput<Integer>();
		
		ob1.setValue(10);
		System.out.println("ob1 : "+ob1.getValue());
		
		GenericInput<Person> ob2=new GenericInput<>();
		ob2.setValue(new Person(101,"AAAAA"));
		System.out.println("Person : "+ob2.getValue().getPersonId()+"  "+ob2.getValue().getPersonName());

	}

}
