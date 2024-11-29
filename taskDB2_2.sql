CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    FirstName VARCHAR2(100),
    LastName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER
);

INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (101, 'John1', 'Doe1', 'HR', 20000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (102, 'John2', 'Doe2', 'IT', 50000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (103, 'John3', 'Doe3', 'CS', 40000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (104, 'John4', 'Doe4', 'IT', 10000);
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary) VALUES (105, 'John5', 'Doe5', 'ZX', 30000);

UPDATE Employees 
SET Salary = 600000 
WHERE EmployeeID = 101;

DELETE FROM Employees 
WHERE Department = '101';

SELECT * 
FROM Employees 
WHERE Department = 'IT';

SELECT EmployeeID, 
       CONCAT(FirstName, ' ', LastName) AS FullName, 
       Department, 
       Salary 
FROM Employees;
