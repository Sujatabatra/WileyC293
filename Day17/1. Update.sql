use wileyc293;

select * from employees;

SET sql_safe_updates=0;

update employees
set salary=salary+(salary*.10);

update employees
set designation=concat('Sr.',designation)
where designation='EXecutive';