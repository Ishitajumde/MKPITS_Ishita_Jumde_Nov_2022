<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard page</title>
</head>
<body>


<%
    String s=(String) session.getAttribute("Id");
%>
<h1>Welcome to MyBank<%=" "+s%></h1><br>
<br><br>
<h4>
  <a href="deposit.jsp">Deposit</a>
    <a href="BalanceSlip.html">Balance Slip</a></h4>
</center>

</body>
</html>