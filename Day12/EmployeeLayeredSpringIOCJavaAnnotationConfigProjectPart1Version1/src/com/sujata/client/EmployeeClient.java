package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.config.EmployeeConfig;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		EmployeePresentation employeePresentation=new EmployeePresentationImpl();

		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("presentation");
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
			System.out.println("=======================================");
		}
	}

}
