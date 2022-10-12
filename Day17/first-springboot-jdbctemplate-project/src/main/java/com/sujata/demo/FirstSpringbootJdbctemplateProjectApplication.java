package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class FirstSpringbootJdbctemplateProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeePresentation presentation;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootJdbctemplateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			presentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			presentation.performMenu(choice);
			
		}
		
	}

}
