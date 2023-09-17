<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13-09-2023
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Registration page</title>
</head>
<body>
<jsp:useBean id="master" class="com.example.bank.UserAccount" scope="application"/>
<jsp:setProperty name="master" property="name" param="txtName"/>
<jsp:setProperty name="master" property="address" param="txtAddress"/>
<jsp:setProperty name="master" property="city" param="txtCity"/>
<jsp:setProperty name="master" property="password" param="txtPass"/>
<jsp:setProperty name="master" property="balance" param="txtBalance"/>

<%
   int result=master.insertData();
   if(result==1)
   {
       response.sendRedirect("login.html");
   }
   else{
       response.sendRedirect("registration.html");
   }
%>
</body>
</html>
