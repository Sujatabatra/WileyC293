package om.sujata.training;

import om.sujata.demo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee(101,"AAA","IT","Associate",6780,4000,150000);
		
		System.out.println("Employee ID : "+employee.getEmployeeId());

	}

}
