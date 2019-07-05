1) Write a query to display Employee name, his salary along with the designation for all the employee.

==> Select Name,salary,Designation from employee_info

2.Write a query to obtain name and his current salary and new salary with a hike 25 % for all the Employee.

==> Select Name,salary as old_salary , (salary + (salary*25)/100) as new_salary from employee_info;

3.Write a query to display all the details of the Employee who are working as salesman.

==> Select * from employee_info where Designation="Salesman";

4.Write a query to display all the employees of Dept.no 20.

==>Select * from employee_info where Dept_ID=20;

5.Write a query to display all the Employees DOB before 1994.

==> Select * from employee_info where DOB<'1994-01-01';

6.Write a query to display all the employees whose annual salary is less than 30,000.

==> Select * from employee_info where salary*12 < 30000 ;

7.Write a query to display name, salary and Annual salary of all the clerks.

==> Select Name,salary,(salary*12) as annual_salary  from employee_info where Designation="Tester" ;

8.Write a query to display all the details of Employee Whoever Hired after Feb of 2013.

==> Select *  from  employee_info where Joining_Date>2013-02-01;

9.Write a query to display managers working in deptno 20 only if salary is greater than 2500.

==> Select *  from  employee_info where Designation="Manager" and Dept_ID=20 and salary>2500;

10.Write a query to display all the employee excluding Analyst.

==> Select *  from  employee_info where Designation !="Analyst" ;

11.Write a query to display all the employees excluding salesman who are working in department 30.

==> Select * from  employee_info where Designation !="Salesman" and Dept_ID=30;

12.Write a query to display names of all the employee who are working in dept 30 as manager OR all the names of employee who are working as a clerk and salary less than 2000.

==>Select name  from  employee_info where Designation ="Manager" and Dept_ID=30 or Designation ="QA" and salary<2000;

13.Write a query to display all the Employees in dept 20 only if their salary is greater than 1000 and less than 3500, including 1000 & 3500.

==>Select *  from  employee_info where Dept_ID=20 and salary>=1000 and salary<=3500;

14.Write a query to display all the details of Employees who are working as clerk in deptno 20,30 or 40.

==> Select *  from  employee_info where Dept_ID in(20,30,40) and Designation="Manager";

15.Write a query to display the details of software developer, manager or clerk who are working in dept.  10 or 20 and salary is greater than 1500.

==> Select *  from  employee_info where Dept_ID in(10,20) and Designation in("Software Developer","Manager","Tester") and salary>1500;

16. Write a query to display all the details of Employees who are working in department 10,20 excluding all the Salesman and Analyst.

==>Select *  from  employee_info where Dept_ID in(10,20) and Designation not in("Salesman","Analyst");

17. Write a query to display name, Salary for all the Employees who are working in dept 10 or 20 and their annual salary between 20,000 and 40,000 including the limits.

==>Select Name,salary from  employee_info where Dept_ID in(10,20) and salary*12 between (20000,40000);

18.Write a query to display all the details of employees who were hire in the month of September working in dept 20 or 30.

==> Select * from employee_info  where Dept_ID in(10,20) and Join_date='%%%%-10-%%';

19.Write a query to display their name and DOJ of employee who works as salesman or clerk and their names has at least one S or E.

==> Select Name,Joining_Date from  employee_info where Designation in("Salesman","tester") and Name like '%s%' or '%e%';

20.Write a query to display Average salary and Highest salary of dept. 20.

==>Select Avg(salary), max(salary) from employee_info Group By Dept_ID=20;

21.Write a query to display date of first and last Hired Employees.

==>==>Select min(Join_date),max(Join_date) from employee_info ;

22.Write a query to display AVG Salary of Employees by excluding president and manager(job).

==> Select Avg(salary) from employee_info where Designation NOT IN ("QA","Manager");

23.Write a query to display the total salary and average salary of each department

==>Select Avg(salary)as average and sum(salary) as Total from employee_info Group By Dept_ID;

24.Write a query to find the highest and least salary of an Employee in each job by excluding the employees whose name has ‘R’ as the last but one character.

==> Select max(salary)as highest_salary and min(salary) as least_salary from employee_info Group By Designation where Name NOT like '%r';

26. Write a query to list the employee whose designation are same as Vikas    or Rahul.

==> Select * from employee_info where Designation='Vikas' or Designation='Rahul' ;

27. Write a query to List the employee whose salary is equal to the average of max and minimum.

==> Select * from employee_info where salary = avg(max(salary));

28. Write a query to display employee name, department name and the location of all employee.

==> Select e.Name,d.Dept_Name,d.location from employee_info e Inner Join employee_departmentinfo d ON e.Dept_ID=d.Dept_ID;

29. Write a query to display all the details of employee whose name begins with the consonants.

==>Select * from employee_info where Name Not like 'a%' or 'e%' or 'i%' or  'o%' or 'u%';

30. Create a Views from Employee_Info table .Views should have all  the record whose salary is greater than 10000.

==> 
CREATE
    
    VIEW `covalense_db`.`View30` 
    AS
   (select `employee_info`.`Id` AS `Id`,`employee_info`.`Name` AS `Name`,`employee_info`.`Email` AS `Email`,`employee_info`.`Designation` AS `Job`,
`employee_info`.`Joining_Date` AS `Hire_date`,`employee_info`.`Salary` AS `Salary`,`employee_info`.`Dept_ID` AS `Dept_no` from `employee_info`
 where (`employee_info`.`Salary` > 10000))

31.  Create a trigger which will work before deletion in employee_info table and create a duplicate copy of the record in another table employee_backup

==>  DELIMITER $$

CREATE

    TRIGGER `covalense_db`.`Trigger31` BEFORE DELETE
    ON `employee_info`
    FOR EACH ROW BEGIN
insert into employee_backup values(old.id,old.Name,old.Age,old.Gender);
    END$$

DELIMITER ;

32.What is Driver Class?

-->Driver class is present under package "java.mysql.jdbc.Driver"
-->It is mandatory to connect to database
-->Provided by DB Vendors in the form of "JAR" File

33.What is DB URL?
-->DB URL is "Data Base Uniform Resource Locator" 
-->It is used to uniquely identified the URL in the Database in our Computers. 



