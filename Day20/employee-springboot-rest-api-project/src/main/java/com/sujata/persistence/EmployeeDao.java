package com.sujata.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmpDepartment(String deptt);
	
	/*
	 * sql : select * from employees;
	 * jpaql : from Employee
	 * while giving queries in JPAQL : Specify ClassName instead of table name and propertyName instead of column name
 	 */
	@Query("select empName from Employee where empSalary>:sal")
	public List<String> searchEmployeesGreaterThanSalary(@Param("sal") double salary);
	
	@Transactional
	@Modifying
	@Query("Update Employee set empSalary=:sal where empId=:id")
	public int updateSalary(@Param("id") int eId,@Param("sal") double salary);
	
	@Transactional
	@Modifying
	@Query(value = "insert into employees values(:id,:name,:des,:dep,:sal)",nativeQuery = true)
	public int insertEmployee(@Param("id") int id,@Param("name") String name,@Param("des") String desig, @Param("dep") String depart,@Param("sal") double sal);
	
	

}
