select deptt, sum(salary)
from employees
group by deptt;

select * from employees;

insert into employees
values(13,"LLLLL",'Executive',null,7000);

select deptt,sum(salary)  -- 3
from employees 
where deptt IS NOT NULL  -- 1
group by deptt;   -- 2


select deptt,sum(salary)  -- 4  (projection)
from employees 
where deptt IS NOT NULL  -- 1 (selection of rows)
group by deptt  -- 2   (creation of group)
having sum(salary)>250000;  -- 3 (selection of group)     