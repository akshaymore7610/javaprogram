/*
 *@ Author Akshay More
*/
show databases;
use employee;
create table  Employee1(
empid int primary key,
Fname varchar(20),
Lname varchar(20),
salary int,
DOJ date,
Department varchar(20)
);
create table if not exists  Employee1(
empid int primary key,
Fname varchar(20),
Lname varchar(20),
salary int,
DOJ date,
Department varchar(20)
);

create table reward(
date_reward Date,
amount int,
employee_id int references Employee1(empid)
);
insert into Employee1(empid,Fname,Lname,salary,DOJ,Department)
values(11,'rushali','bhujbal',40000,'2021-11-10','developer'),
(2,'Ivan','ross',61067,'1986-01-15','developer'),
(3,'vandana','roy',50379,'1987-12-20','dataanalyzer'),
(4,'pramanda','gross',6467,'1988-11-22','Tester'),
(5,'basu','Navindi',60401,'1956-02-25','javadeveloper'),
(6,'Ravi','Shridher',5962,'1989-02-15','Manager'),
(7,'Rukmini','Ayiyer',51274,'1987-07-23','developer');
insert into reward(date_reward,amount,employee_id)
values('2019-05-10',1000,2),
('2018-06-07',2000,4),
('2017-04-09',3000,5),
('2016-05-07',4000,6);
#get all Emplouyee
select*from  Employee1;



#disply first name and last name of employee from employee1
select Fname,Lname
from Employee1;

#Display all the values of the “First_Name” column using the alias “Employee Name”
select Fname  " Employee Name" from Employee1;

#Get all “Last_Name” in lowercase.
select lower(Lname) from Employee1;

#Get all “Last_Name” in uppercase.
select upper(Lname) from Employee1;

#Get unique “DEPARTMENT”.
select distinct department from Employee1;

#Get the first 4 characters of “FIRST_NAME” column.
select substring(Fname ,1,4)
from Employee1;

#Get the position of the letter ‘h’ in ‘John’.
select position("h" in "rushali");

#Get all values from the “FIRST_NAME” column after removing white space on the right.
select Rtrim(fname)from Employee1;

#Get all values from the “FIRST_NAME” column after removing white space on the left.
select Ltrim(fname)from Employee1;

#Get all employees in ascending order by first name.
select*from Employee1 order by fname asc;

#Get all employees in descending order by first name.
select*from Employee1 order by fname desc;

#Get all employees in ascending order by first name and descending order by salary.
select * from Employee1 order by fname asc ,salary desc; 

#Get employees whose first name is neither “Bob” nor “Alex”. 
select * from Employee1 where fname not in('Ravi','Shridher');

#Get employees whose first name is “Bob” or “Alex”.
select * from Employee1 where fname in ('Ravi','Shridher');