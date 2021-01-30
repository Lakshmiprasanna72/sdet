REM   Script: Activity2
REM   SQL

create table salesman1(salesman_id int,salesman_name varchar2(10),salesman_city varchar2(20),commission int);

desc salesman1


desc salesman1


select * from salesman1;

create table salesman2(salesman_id int,salesman_name varchar2(10),salesman_city varchar2(20),commission int);

desc salesman2


select * from salesman2;

create table salesman2(salesman_id int,salesman_name varchar2(10),salesman_city varchar2(20),commission int);

desc salesman2


Insert into salesman2 values(101,'ABC','HYD',10);

select * from salesman2;

create table salesman3(salesman_id int,salesman_name varchar2(10),salesman_city varchar2(20),commission int);

desc salesman3


Insert into salesman3 values(101,'ABC','HYD',10);

select * from salesman3;

create table salesman4(salesman_id int,salesman_name varchar2(10),salesman_city varchar2(20),commission int);

desc salesman4


Insert into salesman4 values(101,'ABC','HYD',10);

insert into salesman4 values(102,'DEF','MUM',12);

insert into salesman4 values(103,'GHI','AP',9);

INSERT ALL into salesman4 values(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman4;

create table salesman5(salesman_id int,salesman_name varchar2(10),salesman_city varchar2(20),commission int);

desc salesman5


Insert into salesman5 values(101,'ABC','HYD',10);

insert into salesman5 values(102,'DEF','MUM',12);

insert into salesman5 values(103,'GHI','AP',9);

INSERT ALL into salesman4 values(5005, 'Pit Alex', 'London', 11) 
    INTO salesman5 VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman5 VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman5 VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman5;

