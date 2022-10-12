package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.sujata")
public class EmployeeConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/wileyc293");
		ds.setUsername("root");
		ds.setPassword("sujata");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
