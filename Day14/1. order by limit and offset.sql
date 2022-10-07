use wileyc293;

select *
from employees
order by salary; -- default ordering ascending

select *
from employees
order by salary desc;

select * 
from employees
order by deptt;

select * 
from employees
order by deptt desc,
salary;


select *
from employees
limit 3;

select *
from employees
limit 3 offset 2;  -- offset : row number and row number starts with 0