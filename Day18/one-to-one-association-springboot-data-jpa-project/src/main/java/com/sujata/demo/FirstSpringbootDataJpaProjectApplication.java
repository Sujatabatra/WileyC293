package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Husband;
import com.sujata.entity.Wife;
import com.sujata.persistence.HusbandDao;
import com.sujata.persistence.WifeDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootDataJpaProjectApplication implements CommandLineRunner {

	@Autowired
	private WifeDao wifeDao;
	
	@Autowired
	private HusbandDao husbandDao;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootDataJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Husband h1=new Husband("H001", "AAAA");
		Husband h2=new Husband("H002", "BBBB");
		Husband h3=new Husband("H003", "CCCC");
		
		Wife w1=new Wife("W001", "Wife A", h2);
		Wife w2=new Wife("W002", "Wife B", h3);
		Wife w3=new Wife("W003", "Wife C", h1);
		
		husbandDao.save(h1);
		husbandDao.save(h2);
		husbandDao.save(h3);
		
		wifeDao.save(w1);
		wifeDao.save(w2);
		wifeDao.save(w3);
	}

}
