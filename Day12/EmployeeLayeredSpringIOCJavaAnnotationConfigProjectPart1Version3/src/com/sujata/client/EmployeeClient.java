package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.config.EmployeeConfig;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

/*
 * springContainer reads configuration file and run life cycle(Constructor => Setter) of all the classes 
 * 1. which are inside the package specified in @ComponentScan and Annotated with @Component ,@Service,@Repository
 * 2. all the components specified by the methods annotated with @Bean
 * 
 */
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
