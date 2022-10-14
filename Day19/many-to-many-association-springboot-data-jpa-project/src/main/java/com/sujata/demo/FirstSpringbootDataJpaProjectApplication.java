package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Professor;
import com.sujata.entity.Student;
import com.sujata.persistence.ProfessorDao;
import com.sujata.persistence.StudentDao;


@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootDataJpaProjectApplication implements CommandLineRunner {


	@Autowired
	private ProfessorDao professorDao;
	
	@Autowired
	private StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootDataJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student s1=new Student(1, "AAAA");
		Student s2=new Student(2, "BBBB");
		Student s3=new Student(3, "CCCC");
		Student s4=new Student(4, "DDDD");
		Student s5=new Student(5, "EEEE");
		Student s6=new Student(6, "FFFF");
		
		List<Student> list1=Arrays.asList(s1,s4,s5,s6);
		List<Student> list2=Arrays.asList(s2,s3);
		
		Professor p1=new Professor("P001", "Professor A", "Digital Electronics", list1);
		Professor p2=new Professor("P002", "Professor B", "Computer Graphics", list2);
		
		studentDao.save(s1);
		studentDao.save(s2);
		studentDao.save(s3);
		studentDao.save(s4);
		studentDao.save(s5);
		studentDao.save(s6);
		
		professorDao.save(p1);
		professorDao.save(p2);

	}

}
