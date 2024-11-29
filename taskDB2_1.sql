CREATE TABLE Doctor (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    salary NUMBER,
    address VARCHAR2(255)
);

INSERT INTO Doctor (id, name, salary, address) VALUES (1, 'Ahmed', 5000, 'Cairo');
INSERT INTO Doctor (id, name, salary, address) VALUES (2, 'Sara', 6000, 'Giza');
INSERT INTO Doctor (id, name, salary, address) VALUES (3, 'Mohamed', 7000, 'Alexandria');
INSERT INTO Doctor (id, name, salary, address) VALUES (4, 'Laila', 8000, 'Aswan');
INSERT INTO Doctor (id, name, salary, address) VALUES (5, 'Omar', 9000, 'Luxor');
INSERT INTO Doctor (id, name, salary, address) VALUES (6, 'Nada', 10000, 'Mansoura');
INSERT INTO Doctor (id, name, salary, address) VALUES (7, 'Ali', 11000, 'Tanta');
INSERT INTO Doctor (id, name, salary, address) VALUES (8, 'Mona', 12000, 'Suez');
INSERT INTO Doctor (id, name, salary, address) VALUES (9, 'Youssef', 13000, 'Port Said');
INSERT INTO Doctor (id, name, salary, address) VALUES (10, 'Heba', 14000, 'Fayoum');

UPDATE Doctor 
SET salary = 20000 
WHERE id = 3;

DELETE FROM Doctor 
WHERE id = 9;

SELECT CONCAT(name, ' earns ', salary) AS name_salary 
FROM Doctor;

SELECT id, name, salary * 2 AS doubled_salary, address 
FROM Doctor;

SELECT * 
FROM Doctor 
WHERE salary IN (1000, 2000, 3000);

ALTER TABLE Doctor RENAME TO PRD_DOCTOR;
