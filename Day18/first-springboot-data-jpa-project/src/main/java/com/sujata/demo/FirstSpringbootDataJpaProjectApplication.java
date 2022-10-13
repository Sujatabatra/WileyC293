package com.sujata.demo;

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
		employeedao.save(new Employee(1,"AAAA","IT","Associate",78000));
		employeedao.save(new Employee(2,"BBBB","Sales","Sr. Associate",88000));
		employeedao.save(new Employee(3,"CCCC","IT","Representative",56000));
		employeedao.save(new Employee(4,"DDDD","Marketing","Manager",150000));
	}

}
