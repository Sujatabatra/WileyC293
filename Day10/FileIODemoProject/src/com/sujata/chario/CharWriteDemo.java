package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class CharWriteDemo {

	public static void main(String[] args) {
		
		String values="Demonstrating Char Input/Ouput";
		
		try(FileWriter fileWriter=new FileWriter("CharDemo")){
		
			fileWriter.write(values);
			System.out.println("File Created!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
