SELECT d.name Department,e.name Employee,e.salary Salary
FROM Department as d,Employee as e
WHERE e.departmentId = d.id AND 
(SELECT COUNT( distinct salary) FROM Employee
WHERE salary > e.salary and departmentId = e.departmentId)<3
ORDER BY d.name,e.salary desc;