<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 15-09-2023
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transfer Jsp</title>
</head>
<body>
<%
 String transferId=request.getParameter("txtName");

 String uid=(String) session.getAttribute("Id");

    java.util.Date obj= new java.util.Date();
    Date date = new Date(obj.getTime());
%>
<jsp:useBean id="trans" class="com.example.bank.Transactions" scope="application" />
<jsp:setProperty name="trans" property="amount" param="txtAmount" />
<jsp:setProperty name="trans" property="transferTo" value="<%=transferId%>" />
<jsp:setProperty name="trans" property="masterId" value="<%=uid%>" />
<jsp:setProperty name="trans" property="transactionDate" value="<%=date%>" />





<%
     trans.transferFrom();

%>
</body>
</html>
