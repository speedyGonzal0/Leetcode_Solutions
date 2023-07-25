SELECT 
e.employee_id, e.name, a.report AS reports_count, a.avg AS average_age
 FROM Employees e INNER JOIN (
SELECT *, COUNT(*) AS report, ROUND(AVG(age)) AS avg FROM Employees GROUP BY reports_to HAVING COUNT(*) >= 1 AND reports_to IS NOT NULL
) a ON e.employee_id = a.reports_to ORDER BY e.employee_id;