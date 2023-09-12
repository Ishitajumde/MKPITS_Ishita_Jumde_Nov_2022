<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 09-09-2023
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
<%
 String s1=request.getParameter("nam1");

 String s2=request.getParameter("nam2");

 if(s1=="" && s2==""){
     RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
    rd.include(request,response);
 }
else{
     RequestDispatcher rd= request.getRequestDispatcher("Welcome1.jsp");
     rd.forward(request,response);
 }
%>
</body>
</html>
