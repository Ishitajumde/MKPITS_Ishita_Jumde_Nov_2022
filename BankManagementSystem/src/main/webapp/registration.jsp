<%@ page import="com.example.bankmanagementsystem.Master" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12-09-2023
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration jsp</title>
</head>
<body>
       <%-- creation of bean--%>/
       <jsp:useBean id="master" class="com.example.bankmanagementsystem.Master" scope="application"></jsp:useBean>

       <%--set the value for bean--%>
       <jsp:setProperty name="master" property="fullName" param="txtName"></jsp:setProperty>
       <jsp:setProperty name="master" property="password" param="txtPass"></jsp:setProperty>
       <jsp:setProperty name="master" property="address" param="txtAddress"></jsp:setProperty>
       <jsp:setProperty name="master" property="city" param="txtCity"></jsp:setProperty>
       <jsp:setProperty name="master" property="balance" param="txtBalance"></jsp:setProperty>
       <%--get the value from the bean--%>
       <jsp:getProperty name="master"  property="fullName" ></jsp:getProperty>
       <jsp:getProperty name="master"  property="password" ></jsp:getProperty>
       <jsp:getProperty name="master"  property="address" ></jsp:getProperty>
       <jsp:getProperty name="master"  property="city" ></jsp:getProperty>
       <jsp:getProperty name="master"  property="balance" ></jsp:getProperty>

<%
  int n=master.insertData();
  if(n==1){
         out.println("Data inserted successfully");
  }
  else{
         response.sendRedirect("registration.html");
  }
%>

</body>
</html>