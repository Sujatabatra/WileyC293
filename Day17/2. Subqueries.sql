/*
display the names of all the employees those are getting salary more than EEEE
*/

select salary
from employees
where empName="EEEE";

select empName
from employees
where salary>97900;

-- or
 select empName
from employees
where salary > (select salary
from employees
where empName="EEEE");

select distinct designation
from employees
where deptt="IT";

select *
from employees
where designation IN ('Associate','Manager');

insert into employees
value(15,'XXXX','Executive','IT',67000);

select *
from employees
where designation IN (select distinct designation
from employees
where deptt="IT");

update employees
set salary=salary+salary*.15
where salary < (select *  from (select salary from employees where empName="AAAA") as X);  