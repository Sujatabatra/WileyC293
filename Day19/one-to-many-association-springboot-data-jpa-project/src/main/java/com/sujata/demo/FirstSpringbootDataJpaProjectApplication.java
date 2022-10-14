package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Employee;
import com.sujata.entity.Project;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.ProjectDao;


@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootDataJpaProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao empDao;;
	
	@Autowired
	private ProjectDao projectDao;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootDataJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee e1=new Employee(1, "AAA", "d1");
		Employee e2=new Employee(2, "BBB", "d2");
		Employee e3=new Employee(3, "CCC", "d1");
		Employee e4=new Employee(4, "DDD", "d3");
		Employee e5=new Employee(5, "EEE", "d1");
		
		List<Employee> p1Employees=Arrays.asList(e1,e3,e5);
		
		List<Employee> p2Employees=Arrays.asList(e2,e4);
		
		Project p1=new Project("P001", "Project A",p1Employees);
		Project p2=new Project("P002","Project B",p2Employees);
		
		
		empDao.save(e1);
		empDao.save(e2);
		empDao.save(e3);
		empDao.save(e4);
		empDao.save(e5);		
		
		projectDao.save(p1);
		projectDao.save(p2);
		

	}

}
