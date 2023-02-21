/*write a sql query to display specific order such as age,mid,phone  */
mysql> select age,mid,phone from members order by age asc,mid asc,phone asc;
/*
+------+------+------------+
| age  | mid  | phone      |
+------+------+------------+
|   12 |    7 | 8632778980 |
|   15 |    6 | 8654434321 |
|   21 |    9 | 8634538980 |
|   22 |   10 | 7734538980 |
|   25 |    8 | 8634538980 |
|   40 |    5 | 8654434571 |
|   43 |    4 | 8654434571 |
|   47 |    3 | 9604780324 |
|   50 |    2 | 9370985891 |
|   75 |    1 | 7749863253 |
+------+------+------------+   */