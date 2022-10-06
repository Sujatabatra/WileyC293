alter table employee 
add dateofjoining date;

select * from employee;

alter table employee
modify department varchar(30);

alter table employee
change department deptt varchar(30);

alter table employee
drop dateofjoining;

alter table employee
rename to employees;

alter table employees
add constraint chk_sal check(salary>0);

alter table employees
drop constraint chk_sal;

SELECT TABLE_NAME, CONSTRAINT_TYPE, CONSTRAINT_NAME
FROM information_schema.table_constraints
WHERE table_name='empforcheck';

select * 
from information_schema.table_constraints
where table_schema='wileyc293'