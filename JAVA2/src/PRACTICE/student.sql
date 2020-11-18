create database if not exists studentinf;
use studentinf;
create table student(
    studentID varchar(50) primary key not null,
    studentName varchar(100) not null ,
    address varchar(200),
    phone int )