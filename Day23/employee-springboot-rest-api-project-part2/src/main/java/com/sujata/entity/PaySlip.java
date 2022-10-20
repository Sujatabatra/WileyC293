package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaySlip {

	private Employee employee;
	private double houseRentAllowance;
	private double fuelAllowance;
	private double deductionOne;
	private double deductionTwo;
	private double netPayableSalary;
	
	
}
