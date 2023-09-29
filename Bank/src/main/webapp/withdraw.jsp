<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 20-09-2023
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Withdraw jsp</title>
</head>
<body>

 <%
      String userId=(String) session.getAttribute("Id");
      System.out.println(userId);
      java.util.Date obj= new java.util.Date();
      Date date = new Date(obj.getTime());
 %>
<jsp:useBean id="with" class="com.example.bank.Transactions" scope="application"/>
<jsp:setProperty name="with" property="transactionDate" value="<%=date %>" />
<jsp:setProperty name="with" property="transactionType" value="Withdraw" />
<jsp:setProperty name="with" property="amount" param="txtAmount" />
<jsp:setProperty name="with" property="masterId" value="<%=userId%>" />

<%
    int result=  with.withdraw();
    if(result==1){
        out.println("withdraw successfully");
    }
    else{
        out.println("transaction failed");
    }
%>
</body>
</html>
