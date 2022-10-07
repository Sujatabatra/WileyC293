-- selection
/*
select <projection list>
from <table Name>
where <selection condition>

Relation Operator : >, <, >=, <=, !=, =, LIKE, IS, BETWEEN, IN
Logical Operator : AND, OR, NOT
*/

select *
from employees
where deptt="it";

select * 
from employees 
where salary>50000;

select * 
from employees;

select *
from employees
where salary IS NULL;

select *
from employees
where salary IS NOT NULL;

select *
from employees
where salary>=50000 AND salary<=100000;
-- or
select *
from employees
where salary BETWEEN 50000 AND 100000;

-- =======================================
select *
from employees
where designation="Manager" or designation="Executive";
-- or
select *
from employees
where designation IN("Manager","Executive");

select * from employees;

/*
1. % : Replaces zero or more characters
2. _ : Replaces one character
*/
select * 
from employees
where designation LIKE "Sr.%";

select * 
from employees
where designation NOT LIKE "Sr.%";

select *
from employees
where deptt LIKE "_a%";
