package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {

	public static void main(String[] args) {
		
		try(
				FileOutputStream fos1=new FileOutputStream("personDetails");
				FileOutputStream fos2=new FileOutputStream("personDetails");
				FileOutputStream fos=new FileOutputStream("personDetails");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			
			Person person=new Person(101, "AAAA", 34);
			oos.writeObject(person);
			System.out.println("File Created");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
