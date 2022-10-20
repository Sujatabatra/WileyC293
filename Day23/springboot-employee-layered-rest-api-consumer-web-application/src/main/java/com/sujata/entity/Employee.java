package com.sujata.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int empId;
	private String empName;
	private String empDepartment;
	private String empDesignation;
	private Double empSalary;
}
