<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12-09-2023
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login jsp</title>
</head>
<body>
  <jsp:useBean id="login" class="com.example.bankmanagementsystem.Master" scope="application"></jsp:useBean>
  <jsp:setProperty name="login" property="fullname" param="txtName"></jsp:setProperty>
  <jsp:setProperty name="login" property="password" param="txtName"></jsp:setProperty>

  <jsp:getProperty  name="login" property="fullname"></jsp:getProperty>
  <jsp:getProperty name="login" property="password" ></jsp:getProperty>
</body>
</html>
