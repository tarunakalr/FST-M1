REM   Script: activity9
REM   ACTIVITY9

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no, order_date from orders order by order_date;

select order_no, purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

select * from customers;

insert  into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001),  
(3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), 
(3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), 
(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), 
(3001, 'Brad Guzan', 'London', 300, 5005);

insert  into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001),  
(3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), 
(3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), 
(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), 
(3001, 'Brad Guzan', 'London', 300, 5005);

DROP CUSTOMERS;

DROP TABLE CUSTOMERS;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert  into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001),  
(3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), 
(3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), 
(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), 
(3001, 'Brad Guzan', 'London', 300, 5005);

INSERT INTO CUSTOMERS VALUES 
(3002, 'Nick Rimando', 'New York', 100, 5001);

INSERT INTO CUSTOMERS VALUES 
(3007, 'Brad Davis', 'New York', 200, 5001) 
(3005, 'Graham Zusi', 'California', 200, 5002) 
(3008, 'Julian Green', 'London', 300, 5002) 
(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
(3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007);

INSERT INTO CUSTOMERS VALUES 
(3007, 'Brad Davis', 'New York', 200, 5001) 
(3005, 'Graham Zusi', 'California', 200, 5002) 
(3008, 'Julian Green', 'London', 300, 5002) 
(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
(3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007);

INSERT INTO CUSTOMERS VALUES 
(3007, 'Brad Davis', 'New York', 200, 5001);

INSERT INTO CUSTOMERS VALUES 
 
(3005, 'Graham Zusi', 'California', 200, 5002);

INSERT INTO CUSTOMERS VALUES 
 
 
(3008, 'Julian Green', 'London', 300, 5002);

INSERT INTO CUSTOMERS VALUES 
 
 
 
(3004, 'Fabian Johnson', 'Paris', 300, 5006);

INSERT INTO CUSTOMERS VALUES 
 
 
 
 
(3009, 'Geoff Cameron', 'Berlin', 100, 5003);

INSERT INTO CUSTOMERS VALUES 
 
 
 
 
 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007);

INSERT INTO CUSTOMERS VALUES 
(3001, 'Brad Guzan', 'London', 300, 5005);

INSERT INTO CUSTOMERS VALUES 
(3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

select a.Customer_name as "Customer", a.city, b.salesman_name as "Salesman",b.commission from customers  a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT * FROM SALESMAN;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

