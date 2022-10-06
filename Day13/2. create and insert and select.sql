-- primary key is used to uniquely identify each and every record
-- primary key value is unique
create table employee(
empId int primary key,
empName varchar(30),
designation varchar(25),
department varchar(25),
salary double);

insert into employee
values(1,'AAAA','Executive','Sales',35000);

insert into employee
values(2,'BBBB','Associate','IT',55000),
(3,'CCCC','Sr. Associate','Marketing',78000),
(4,'DDDD','Manager','IT',155000),
(5,'EEEE','Sr. Associate','Sales',89000);


insert into employee(empId,empName,salary,department,designation)
values(6,'FFFF',67000,'Marketing','Sr. Executive');

select * from employee;


insert ignore into employee
values(2,'BBBB','Associate','IT',55000),
(7,'GGGG','Sr. Associate','Marketing',78000),
(8,'HHHH','Manager','IT',155000),
(9,'IIII','Sr. Associate','Sales',89000);