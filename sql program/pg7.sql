 /* write a sql query to fetch the data from salesman_id=5001 and return order_no,ord_date,purch_amt */
mysql> select order_no,ord_date,purch_amt from orders where salesman_id=5001;
/*
+----------+------------+-----------+
| order_no | ord_date   | purch_amt |
+----------+------------+-----------+
|    70002 | 2012-10-05 |     65.26 |
|    70005 | 2012-07-27 |    2400.6 |
|    70008 | 2012-09-10 |      5760 |
+----------+------------+-----------+   */