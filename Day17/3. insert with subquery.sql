create table salesemployee(
eId int primary key,
eName varchar(30),
desig varchar(25),
department varchar(25),
salary double);

insert into salesemployee(eId,eName,desig,department,salary)
(select empid,empName,designation,deptt,salary 
from employees
where deptt="Sales");

select * from salesemployee;