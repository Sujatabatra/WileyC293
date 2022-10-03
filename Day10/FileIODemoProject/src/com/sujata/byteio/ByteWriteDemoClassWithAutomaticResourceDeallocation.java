package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteDemoClassWithAutomaticResourceDeallocation {

	public static void main(String[] args) {
		byte values[]= {'S','U','J','A','T','A','\n','I','N','D','I','A'};
		
		 
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("ByteDemo");) {
			
			
			fileOutputStream.write(values);
			
			System.out.println("File Created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
