CREATE DATABASE ebookStore;
/* tao bang books */
CREATE TABLE books(
  idBook int,
  nameBook varchar(200),
  author varchar(100),
  price float,
  category varchar(100),/* the loai */
  qty int, /*so luong */
  years int,
  status int;

  PRIMARY KEY (idBook));
  /*insert*/
  INSERT INTO books VALUES (101, 'book1', 'code lean', 100, 'cate1', 200, 2001,2);
  INSERT INTO books VALUES (102, 'book2', 'dangkt', 200, 'cate2', 220, 2001, 1);
  INSERT INTO books VALUES (103, 'book3', 'code lean', 130, 'cate3', 230, 2002,2);
  INSERT INTO books VALUES (104, 'book4', 'code lean', 140, 'cate4', 110),2005,1;
  INSERT INTO books VALUES (105, 'book5', 'dangkt', 150, 'cate5', 150,2003,2);
  INSERT INTO books VALUES (106, 'book6', 'code lean', 160, 'cate6', 200,2002,1);
  INSERT INTO books VALUES (107, 'book7', 'code lean', 170, 'cate7', 270, 2001,1);

/* tao bang Customer */
CREATE TABLE customer(
  idCus varchar(50),
  nameCus varchar(200),
  address varchar(200),
  email varchar(100),
  phone int,
  PRIMARY KEY (idCus));
  /*insert*/
  INSERT INTO customer VALUES ('C101', 'haley', '121,acb, america', 'abc@gamil.com', '123456789');
  INSERT INTO customer VALUES ('C102', 'john', '122,acb, america', 'abc@gamil.com', '123456889');
  INSERT INTO customer VALUES ('C103', 'leon', '123,acb, america', 'abc@gamil.com', '123356689');
  INSERT INTO customer VALUES ('C104', 'jk', '124,acb, america', 'abc@gamil.com', '123446689');
  INSERT INTO customer VALUES ('C105', 'kevin', '125,acb, america', 'abc@gamil.com', '123455689');
  INSERT INTO customer VALUES ('C106', 'taeh', '126,acb, america', 'abc@gamil.com', '123456689');

/*tao bang orderDetails */
CREATE TABLE orderDetails(
  id int,
  nameBook String,
  idCus varchar(50),
  idBook int,
  price float,
  qty int,
  amount int,
  status int, /* 0: het hang, 1: con hang, 2: cho xu li, 3; da dong goi */
  FOREIGN KEY (idCus) REFERENCES  customer(idCus),
  FOREIGN KEY (idBook) REFERENCES books(idBook));

  /*insert*/
  INSERT INTO orderdetails VALUES (01,'C101', 101, 100, 2, 1);
  INSERT INTO orderdetails VALUES (02,'C102', 102, 200, 2, 0);
  INSERT INTO orderdetails VALUES (03,'C103', 103, 130, 1, 2);
  INSERT INTO orderdetails VALUES (04,'C104', 104, 140, 3, 2);
  INSERT INTO orderdetails VALUES (05,'C105', 107, 170, 7, 3);

