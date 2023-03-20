<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 20-03-2023
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>adminprocess</title>
</head>
<body>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver load successfully");
        Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/officemanagement", "root", "i123");
        System.out.println("database connected successfully");

        String s1 = request.getParameter("aid");
        out.print(s1);
        String s2 = request.getParameter("aname");
        out.print(s2);
        String s3 = request.getParameter("apass");
        out.print(s3);
        String s4 =request.getParameter("role");
        out.print(s4);

        PreparedStatement ps1 = con.prepareStatement("insert into admin values (?,?,?,?)");
        ps1.setString(1, s1);
        ps1.setString(2, s2);
        ps1.setString(3, s3);
        ps1.setString(4,"a");
        ps1.execute();
    }
    catch(Exception e){
        System.out.println(e);
    }
%>

</body>
</html>
