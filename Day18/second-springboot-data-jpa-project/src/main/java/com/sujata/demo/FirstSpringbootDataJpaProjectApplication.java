package com.sujata.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootDataJpaProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeedao;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootDataJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> empList=employeedao.findAll();
		for(Employee employee:empList) {
			System.out.println(employee);
		}
	}

}
