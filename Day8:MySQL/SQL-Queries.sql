 /*Question-1:Create a table Department with the following fields:
departmentId– Integer, Primary Key
departmentName– Varchar(50), Not Null*/

CREATE TABLE Department (
    departmentId INTEGER PRIMARY KEY,
    departmentName VARCHAR(50) NOT NULL
);

 /*Question-2:Create a table Employee with the following fields:
employeeId– Integer, Primary Key
employeeName– Varchar(50), Not Null
salary– Integer
departmentId– Integer (Foreign Key referencing Department.deptId)*/

create table Employee ( 
  employeeId integer primary key not null,
  employeeName varchar(15) not null,
  salary integer, 
  departmentId integer,
  foreign key (departmentId) references Department(departmentId));
  
   /*Question-3:Insert the following records into Department:
(1, IT)
(2, HR)
(3, Finance)*/

  insert into Department values(1,'IT');
  
  insert into Department (departmentId, departmentName)
values
    (2, 'HR'),
    (3, 'Finance'),
    (4, 'Sales');
  
  select * from Department;
  
   /*Question-4: Insert employee records into Employee:
(101, Rahul, 50000, 1)
(102, Anita, 60000, 2)
(103, Vijay, 55000, 1)*/

  insert into Employee (employeeId,employeeName,salary,departmentId)
  values
        (101,'Rahul',50000,1),
        (102,'Anitha',60000,2),
        (103,'Vijay',55000,3);

select * from Employee;

 /*Question-5: Find employees whose salary is greater than 55,000*/
--
select *
from Employee
where salary>55000;

 /*Question-6: Update salary of employee with employeeId = 101 to 58,000*/

update Employee
set Salary = 58000
where employeeId=101;

select * from Employee;

 /*Question-7:Delete employee with employeeId = 103.*/
 
 delete employee
 from Employee
 where employeeId=103;
 
 select * from Employee;
 
  /*Question-8:Fetch employees who work in the IT department.*/
  
  select *
  from Employee
  where departmentId=(select departmentId
					  from Department
                      where departmentName='IT');

   /*Question-9:Display employee names and their department names.*/

  select e.employeeName,d.departmentName
  from Employee e,Department d
  where e.departmentId=d.departmentId;
  
  /*Question-10: Change department of employee employeeId = 102 to Finance*/
  
  update Employee
  set departmentId='3'
  where employeeId='102';
  
  select* from Employee;
  
    /*Question-11:Display the highest salary from Employee table.*/
    
  select max(salary)
  from Employee;
  
/*Question-12:Display employee details in acending order of salary*/

  /* Extra insertion!!! */
  insert into Employee values(103,'Sheela',20000,2);
  
select * 
from Employee
order by salary;

/*Question-13:Delete all employees working in HR department.*/

delete
from Employee
where departmentId=(select departmentId
                     from Department
                     where departmentName='HR');
		
  select * from Employee;      
  
  /*Question-14: Display employees whose name starts with the letter ‘R’.*/

select employeeName
from Employee
where employeeName like 'R%';

  /*Question-15:vDisplay the employee with the lowest salary.*/

select employeeName, salary
from Employee
where salary = (select min(salary) from Employee);

select min(salary)
from Employee;

  /*Question-16:Update employee name from ‘Rahul’ to ‘Rahul Sharma’*/
  
SET SQL_SAFE_UPDATES = 0;

update Employee
set employeeName='Rahul Sharma'
where employeeName='Rahul';

select * from Employee;


  /*Question-17:. Display the number of employees in each department*/
  
  select d.departmentName,count(e.employeeId)
  from Employee e,Department d
  where e.departmentId=d.departmentId
  group by d.departmentName;
  
    /*Question-18: delete names contain the letter 'a'*/

delete 
from Employee
where employeeName like '%a%';

SELECT * FROM EMPLOYEE;
  
      /*Question-19:salary less than 52000*/

INSERT INTO EMPLOYEE VALUES(101,'ABC',60000,2);
INSERT INTO EMPLOYEE VALUES(106,'YZW',27000,1);
INSERT INTO EMPLOYEE VALUES(102,'XMS',60000,2);
INSERT INTO EMPLOYEE VALUES(103,'OPS',20000,4);

select employeeName
from employee
where salary<52000;


/*Question-20:salary between 50000 and 65000*/
      
/* Extra Updations*/

update employee
set salary=58000
where employeeId=102;

select * from employee;

/* Actual query*/ 


select employeeName
from employee
where salary between 50000 and 65000;
