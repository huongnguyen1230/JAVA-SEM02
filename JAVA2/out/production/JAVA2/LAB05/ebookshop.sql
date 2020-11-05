CREATE DATABASE ebookshop;
USE ebookshop;

CREATE TABLE books(
  id int,
  title varchar(200),
  author varchar(100),
  price float,
  qty int, /*so luong */
  PRIMARY KEY (idBook));

  INSERT INTO books VALUES (1001, 'java for dummies', 'dang kim thi', 11, 11);
  INSERT INTO books VALUES (1002,'more java for dummies','dang kim thi',22,22)
  INSERT INTO books VALUES (1003, 'more java for more dummies','dang kim thi',33,33)
  INSERT INTO books VALUES (1004,'java','dang kim thi',44,44)
  INSERT INTO books VALUES (1005,'java', 'dang kim thi',56,11)
  INSERT INTO books VALUES (3001,'Gone', 'FishingKumar',11,11)
  INSERT INTO books VALUES (3002,'Gone', 'Fishing2' ,'Kumar',22,22)
  INSERT INTO books VALUES (3003,'Gone', 'Fishing3' ,'Kumar',33,33)
  INSERT INTO books VALUES (3004,'Fishing' ,101,'Kumar',NULL,NULL)