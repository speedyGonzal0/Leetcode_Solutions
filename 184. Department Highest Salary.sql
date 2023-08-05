
SELECT 
Department,
Employee, 
Salary
FROM(
  SELECT 
  d.name AS Department,
  e.name AS Employee,
  e.salary AS Salary,
  DENSE_RANK() OVER(PARTITION BY d.id ORDER BY salary DESC) AS sal_rank
  FROM Employee e INNER JOIN Department d ON e.departmentId = d.id  
) o WHERE o.sal_rank = 1;