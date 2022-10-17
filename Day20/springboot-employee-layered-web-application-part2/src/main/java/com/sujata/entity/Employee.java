package com.sujata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	private int empId;
	private String empName;
	@Column(name = "deptt")
	private String empDepartment;
	@Column(name = "designation")
	private String empDesignation;
//  if any column in table contains null and we want to read it as well, take type of that property as wrapper instead of primituve
	@Column(name = "salary")
	private Double empSalary;
}
