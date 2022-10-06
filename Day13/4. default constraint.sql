create table empfordefault(
empId int auto_increment primary key,
empName varchar(30),
designation varchar(25),
department varchar(25) default 'Dummy Department',
salary double);

insert into empfordefault(empName,designation,department,salary)
values('AAAA','Executive','Sales',34000);

select * from empfordefault;

insert into empfordefault(empName,designation,salary)
values('BBBB','Executive',34000);

insert into empfordefault(empName,salary)
values('CCCC',34000);