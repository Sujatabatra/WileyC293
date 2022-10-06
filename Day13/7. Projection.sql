-- projection : selecting columns

select *
from employees;

/*
select <column list>
from <table name>
*/

select empId,empName
from employees;

select concat('Employee ',empName,' works in ',deptt) as "Employee Details"
from employees;

select * from employees;

insert into employees
values(10,'JJJJ','Manager','IT',null);

/*
display employeename, hra=15% of salary
,deduction=8% of salary, additional allowance=12% of salary,
total salary
*/

select
empName,
.15*salary as "HRA",
.08*salary as "Deduction",
.12*salary as "Additional Allowance",
salary+.15*salary+.12*salary-.08*salary as "Total Salary"
from employees;

select
empName,
.15*salary "HRA",
.08*salary "Deduction",
.12*salary "Additional Allowance",
salary+.15*salary+.12*salary-.08*salary "Total Salary"
from employees;

select
empName,
.15*salary HRA,
.08*salary Deduction,
.12*salary "Additional Allowance",
salary+.15*salary+.12*salary-.08*salary "Total Salary"
from employees;