
SELECT
emp_name AS Department,
dept_name AS Employee,
salary AS Salary
FROM (
  SELECT
  e.name AS emp_name, e.salary, d.name AS dept_name,
  DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC) AS sal_rank
  FROM Employee e
  INNER JOIN 
  Department d ON e.departmentId = d.id
) j WHERE j.sal_rank <= 3;