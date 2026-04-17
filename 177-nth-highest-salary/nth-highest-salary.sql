CREATE FUNCTION getNthHighestSalary (N INT) RETURNS INT
BEGIN
RETURN (
    SELECT DISTINCT salary
FROM(
    Select salary,DENSE_RANK() OVER (ORDER BY salary DESC) AS Rn
    FROM Employee
)AS SalaryRanking
WHERE Rn = N
);
END