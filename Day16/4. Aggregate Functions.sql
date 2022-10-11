use wileyc293;

select * from employees;

/*
Aggregate functions
*/

select count(*) 
from employees;

select count(distinct deptt)
from employees;

select MIN(salary)
from employees;

select MAX(salary)
from employees;

select sum(salary)
from employees;

/*
Sort of bug of MySql to display multi row column output with one row column output
but multirow column first row will get displayed
*/
select empName,max(salary)
from employees;