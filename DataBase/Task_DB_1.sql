/*create table Manger contain
id, name , age , birth_date , address --done
----------------------------------
alter table manger drop address column-------done
alter table manger add column (city_address, street)-------done
-------------------------------------
modify column name to full_name ---done
-------------------------------------
make this table just for read--done
-------------------------------
create table same as  Manger with name Owner
just has colum id, name, birth_date ----------done
----------------------------------------
rename manger table name to Master
-----------------------------------------
drop all tables  
*/
 CREATE TABLE  Manger(
 id int Not Null,
 Fullname varchar(255) default 'Non name',
 age int,
 birth_date date ,
 address varchar(255)
 );
 alter table manger
 drop column address;

 alter table manger
 add city_address varchar(255),
 street varchar(255);

ALTER TABLE manger
ALTER COLUMN Supername VARCHAR(100);

--to change column name in sql server
EXEC sp_rename 'manger.Fullname', 'Supername', 'COLUMN';

--to mode readonly
--alter table manger readonly;
DENY INSERT, UPDATE, DELETE ON dbo.manger TO your_user;

SELECT id, Supername, birth_date
INTO Owner_copy
FROM Manger;

drop table Owner_copy;

SELECT * FROM Owner_copy;
SELECT * FROM manger;


-- وضع قاعدة البيانات في وضع المستخدم الفردي
ALTER DATABASE [abc] SET SINGLE_USER WITH ROLLBACK IMMEDIATE;

-- تغيير اسم قاعدة البيانات
ALTER DATABASE [abcd] MODIFY NAME = [ABCD3];

-- إعادة قاعدة البيانات إلى الوضع الطبيعي
ALTER DATABASE [ABCD] SET MULTI_USER;




