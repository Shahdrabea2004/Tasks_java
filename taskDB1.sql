CREATE TABLE Manger (
    id NUMBER PRIMARY KEY,
    full_name VARCHAR2(100),
    age NUMBER,
    birth_date DATE
);

ALTER TABLE Manger DROP COLUMN address;

ALTER TABLE Manger ADD (
    city_address VARCHAR2(100),
    street VARCHAR2(100)
);

ALTER TABLE Manger RENAME COLUMN name TO full_name;

GRANT SELECT ON Manger TO PUBLIC;
REVOKE INSERT, UPDATE, DELETE ON Manger FROM PUBLIC;

CREATE TABLE Owner AS 
SELECT id, full_name AS name, birth_date 
FROM Manger;

ALTER TABLE Manger RENAME TO Master;

BEGIN
    FOR t IN (SELECT table_name FROM user_tables) LOOP
        EXECUTE IMMEDIATE 'DROP TABLE ' || t.table_name || ' CASCADE CONSTRAINTS';
    END LOOP;
END;
/
