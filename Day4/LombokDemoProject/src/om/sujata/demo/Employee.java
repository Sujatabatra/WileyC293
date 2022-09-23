package om.sujata.demo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private String employeeDesignation;
	private double allowances;
	private double deductions;
	private double totalSalary;
	
	
}
