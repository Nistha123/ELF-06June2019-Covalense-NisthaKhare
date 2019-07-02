1. WAQ to display all the employee whose name and job is having exactly 5 characters

==> select * from employee where First_Name like'_____' and Job like'_____';

2. WAQ to display all the employee whose job starts with "soft";

==> select * from employee where Job like 'soft%';

3. WAQ to display the maximum salary for each job

==> select job,max(salary) salary,First_Name from employee group by Job;

4. WAQ to display the department numbers along with number of employees working in it.

==> select count(First_Name) No_Of_employees, Dept_no from employee group by Dept_no;

5. WAQ to display the minimum salary for each of the job excluding all the employees whose name end with 'S'.

==> select First_Name , min(salary) salary , job from employee where First_Name NOT like '%s' GROUP BY JOB ;