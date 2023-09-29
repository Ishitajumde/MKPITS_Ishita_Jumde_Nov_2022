<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 20-09-2023
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String s1=(String) session.getAttribute("Id");
%>
    <h1><%=s1%></h1>


        <jsp:useBean id="bal" class="com.example.bank.Transactions" scope="application"/>
        <jsp:setProperty name="bal" property="masterId" value="<%=s1%>" />
        <jsp:useBean id="log" class="com.example.bank.UserAccount" scope="application"/>

<table border="2">
    <tr>
        <td>Transaction Date</td>
        <td>Transaction type</td>
        <td>balance</td>
    </tr>

  <%
      ResultSet result= bal.balanceSheet();
      while (result.next()){

  %>
        <tr>
        <td><%=result.getDate("transactionDate") %></td>
        <td><%=result.getString("transactionType") %></td>
        <td><%=result.getDouble("amount") %></td>
        </tr>

 <%
     }

 %>

    </table>

<h3> Balance:<%=log.totalAmount()%></h3>

</body>
</html>
