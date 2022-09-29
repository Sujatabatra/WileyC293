package com.sujata.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {

	@Setter
	@Getter
	private int employeeId;
	@Setter
	@Getter
	private String employeeName;
	@Setter
	@Getter
	private String employeeDepartment;
	@Setter
	@Getter
	private String employeeDesignation;
	@Setter
	@Getter
	private double employeeSalary;
}
