select * from employees;

select * from department;

insert into department
values(333,"Purchase","Delhi");

select e.empId,e.empname ,d.depttId,e.deptt
from employees e
left join department d
ON e.deptt=d.depttName;

select e.empId,e.empname ,d.depttId,e.deptt
from employees e
right join department d
ON e.deptt=d.depttName;
