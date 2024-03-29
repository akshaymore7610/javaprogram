/*
 *@ Author Akshay More
*/
#Get the department and total salary, grouped by department, and 
#sorted by total salary in descending order.

SELECT department, SUM(salary) As total
FROM Employee1 
GROUP BY department
order by total desc;

#Get the department, the number of employees in that department
# and the total salary grouped by department, and sorted by 
#total salary in descending order.

SELECT department, COUNT(Fname), SUM(salary) AS total 
FROM Employee1 
GROUP BY department
ORDER BY total DESC;

# Get the average salary by department in ascending order of salary.

SELECT department, AVG(salary) AS AvgSalary 
FROM Employee1
GROUP BY department
ORDER BY AvgSalary ASC;

#Get the maximum salary by department in ascending order of salary.

SELECT department , MAX(salary) AS MaxSalary
FROM Employee1 
GROUP BY department
ORDER BY MaxSalary ASC;

#Get the minimum salary by department in ascending order of salary.

SELECT department, MIN(salary) AS MinSalary 
FROM Employee1
GROUP BY department
ORDER BY MinSalary ASC;

#Get the number of employees grouped by year and month of membership.
