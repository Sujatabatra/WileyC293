package com.sujata.demo;

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
		
		Project p1=new Project("P001", "Project A");
		Project p2=new Project("P002","Project B");
		
		
		Employee e1=new Employee(1, "AAA", "d1", p2);
		Employee e2=new Employee(2, "BBB", "d2", p1);
		Employee e3=new Employee(3, "CCC", "d1", p2);
		Employee e4=new Employee(4, "DDD", "d3", p1);
		Employee e5=new Employee(5, "EEE", "d1", p2);
		
		projectDao.save(p1);
		projectDao.save(p2);
		
		empDao.save(e1);
		empDao.save(e2);
		empDao.save(e3);
		empDao.save(e4);
		empDao.save(e5);
	}

}
