create table department(
depttId int primary key,
depttName varchar(30) not null unique,
location varchar(20) );

insert into department
values(111,'Sales',null);

insert into department
values(222,'IT','London');

insert into department
values(333,'Marketing','London');

insert into department
values(444,null,'Delhi');

-- On DELETE CASCADE
create table emp(
empId int primary key,
empName varchar(30),
designation varchar(25),
department varchar(25),
salary double,
depttId int ,
constraint dept_FK foreign key(depttId) 
references department(depttId) ON DELETE set null );

insert into emp
values(1,'AAAA','Executive','Sales',35000,111),
(2,'BBBB','Associate','IT',55000,222),
(3,'CCCC','Sr. Associate','Marketing',78000,111),
(4,'DDDD','Manager','IT',155000,333),
(5,'EEEE','Sr. Associate','Sales',89000,111);

select * from emp;

select * from department;

delete from department where depttId=333;