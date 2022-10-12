use wileyc293;

create or replace view salesemp
as
select empName name ,designation desig from employees where deptt="Sales";

select * from salesemp;

describe salesemp;

create or replace view ITView
(eId,eName,desig,salary,allowance,deduction,totalsalary)
as
select empId,empName,designation,salary,.15*salary,.12*salary,salary+.15*salary-.12*salary
from employees
where deptt="IT";

select * from ITView;