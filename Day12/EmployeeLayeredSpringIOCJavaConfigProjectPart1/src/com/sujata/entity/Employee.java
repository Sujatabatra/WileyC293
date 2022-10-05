package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private int employeeId;
	private String employeeName;
	private String designation;
	private String department;
	private double salary;
}
