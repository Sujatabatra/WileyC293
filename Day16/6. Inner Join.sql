CREATE TABLE members (
    member_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (member_id)
);

INSERT INTO members(name)
VALUES("John"),
("Jane"),
("Mary"),
("David"),
("Amelia");

select * from members;

CREATE TABLE committees (
    committee_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (committee_id)
);

INSERT INTO committees(name)
VALUES('John'),
('Mary'),
('Amelia'),
('Joe');

select * from committees;

/*
equi join
*/
SELECT 
    m.member_id, 
    m.name AS member, 
    c.committee_id, 
    c.name AS committee
FROM
    members m
INNER JOIN committees c USING(name);

SELECT 
    m.member_id, 
    m.name AS member, 
    c.committee_id, 
    c.name AS committee
FROM
    members m
INNER JOIN committees c
ON m.name=c.name;

select * from employees;

select * from department;

select e.empId,e.empname ,d.depttId,e.deptt,e.salary
from employees e
Inner join department d
ON e.deptt=d.depttName;

select e.empId,e.empname ,d.depttId,e.deptt,e.salary
from employees e
Inner join department d
ON e.deptt=d.depttName and salary>100000;