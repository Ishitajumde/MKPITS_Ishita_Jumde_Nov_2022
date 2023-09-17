<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 13-09-2023
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login jsp page</title>
</head>
<body>
<jsp:useBean id="log" class="com.example.bank.UserAccount" scope="application" />

<jsp:setProperty name="log" property="name" param="txtName"/>
<jsp:setProperty name="log" property="password" param="txtPass" />
<%
   int a=log.check();
   if(a==0){
       response.sendRedirect("dashboard.html");
   }
   else{
       response.sendRedirect("error.html");
   }
%>

</body>
</html>
