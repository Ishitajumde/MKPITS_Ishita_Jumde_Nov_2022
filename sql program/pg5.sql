/*write a sql query to identify unique mob no and return mob no   */
mysql> select phone from members where phone like '865%';
/*
+------------+
| phone      |
+------------+
| 8654434571 |
| 8654434571 |
| 8654434321 |
+------------+   */