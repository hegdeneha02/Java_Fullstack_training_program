create database JSSATE;
use JSSATE;
create table student(Regno int,Name varchar(20),Mark1 int,Mark2 int,Total int,primary key(Regno));
insert into student values(001,'Arav',80,80,160);
insert into student values(002,'Arjun',85,80,165);
insert into student values(003,'Neha',70,80,150);
insert into student values(004,'Nitya',85,85,170);
insert into student values(005,'Sinchana',85,85,170);
select * from student;
delete from student where Regno=001;
truncate table student;
drop table student;
