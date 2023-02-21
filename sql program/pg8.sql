/* write sql query to locate freinds who live in nagpur and return their name and mob*/
mysql> select name,mob from freinds where address='nagpur';
/*
+-----------+------------+
| name      | mob        |
+-----------+------------+
| Mayuri    | 6536455634 |
| Bharti2   | 6536455634 |
| Ankita    | 7736455634 |
| Aachal    | 7736475634 |
| Pratiksha | 7736475611 |
+-----------+------------+   */