create table empforcheck(
empId int auto_increment primary key,
empName varchar(30),
designation varchar(25),
department varchar(25) default 'Dummy Department',
salary double,
check (salary>0));

insert into empforcheck(empName,designation,department,salary)
values('AAAA','Executive',null,6500);

select * from empforcheck;

insert into empforcheck(empName,designation,department,salary)
values('BBBB','Sr. Executive','IT',-6500);