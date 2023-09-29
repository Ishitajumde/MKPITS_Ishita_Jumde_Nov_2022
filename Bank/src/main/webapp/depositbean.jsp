
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 14-09-2023
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deposit jsp bean</title>
</head>
<% String userId= (String) session.getAttribute("Id");
    System.out.println(userId);
//
    java.util.Date udate = new java.util.Date();
    Date date = new Date(udate.getTime());
    System.out.println(date);
%>
<body>
<jsp:useBean id="dep" class="com.example.bank.Transactions" scope="application" />
<jsp:setProperty name="dep" property="transactionDate" value="<%=date%>" />
  <jsp:setProperty name="dep" property="amount" param="txtAmount" />
   <jsp:setProperty name="dep" property="transactionType" value="Deposit"/>
   <jsp:setProperty name="dep" property="masterId" value= '<%=userId%>' />

<% int value = dep.deposit();
if(value==1){
    out.println("Deposit Successfully");
}
else {
  out.println("error");
}
%>
</body>
</html>
