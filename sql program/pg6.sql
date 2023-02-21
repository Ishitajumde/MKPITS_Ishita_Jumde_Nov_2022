/*write a sql query to locate whose grade is 200. return  customer_id, cust_name,city ,grade ,salesman_id */
mysql> select * from customer where grade=200;
/*
+-------------+-------------+------------+-------+-------------+
| customer_id | cust_name   | city       | grade | salesman_id |
+-------------+-------------+------------+-------+-------------+
|        3007 | Brad Davis  | New york   |   200 |        5002 |
|        3005 | Graham Zusi | California |   200 |        5002 |
+-------------+-------------+------------+-------+-------------+
2 rows in set (0.00 sec)*/