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
  <a href="deposit.html">Deposit</a>
    <a href="withdraw.html">Withdraw</a>
    <a href="transfer.html">Transfer</a>
    <a href="balanceSheet.jsp">Balance Slip</a></h4>
</center>

</body>
</html>