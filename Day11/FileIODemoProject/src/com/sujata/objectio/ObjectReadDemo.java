package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) {
		try(
				FileInputStream fis=new FileInputStream("personDetails");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Person person=(Person)ois.readObject();
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
//ParentReference=childobject (Correct)
//childreference=parentObject ( we can't)