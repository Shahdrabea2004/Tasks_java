SELECT * 
FROM Employees 
WHERE EmployeeID BETWEEN 100 AND 105;

SELECT * 
FROM Employees 
WHERE EmployeeID IN (151, 152, 153, 154, 155);

SELECT * 
FROM Employees 
WHERE LOWER(SUBSTR(FirstName, 1, 1)) = 'p';

SELECT * 
FROM Employees 
WHERE LOWER(SUBSTR(FirstName, -1)) = 'a';

SELECT * 
FROM Employees 
WHERE LOWER(FirstName) LIKE '%a%';

SELECT * 
FROM Employees 
WHERE LOWER(SUBSTR(FirstName, 3, 1)) = 'e';

SELECT * 
FROM Employees 
WHERE manager_id IS NULL;

SELECT * 
FROM Employees 
WHERE manager_id IS NOT NULL;

INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary, manager_id) 
VALUES (106, 'Alice', 'Brown', 'HR', 40000, NULL);

SELECT * 
FROM Employees 
WHERE job_id IN ('AD_VP', 'IT_PROG');

SELECT * 
FROM Employees 
ORDER BY LastName ASC;

SELECT * 
FROM Employees 
ORDER BY HireDate DESC;

SELECT * 
FROM Employees 
ORDER BY Department ASC, Salary DESC;

SELECT EmployeeID, LOWER(LastName) AS LowerLastName 
FROM Employees;

SELECT EmployeeID, UPPER(FirstName) AS UpperFirstName 
FROM Employees;

SELECT EmployeeID, INITCAP(FirstName) AS TitleFirstName, INITCAP(LastName) AS TitleLastName 
FROM Employees;

SELECT * 
FROM Employees 
WHERE LOWER(LastName) = 'smith';
