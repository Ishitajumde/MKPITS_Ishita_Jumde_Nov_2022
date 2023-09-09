<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>

<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%

Class.forName("com.mysql.cj.jdbc.Drive");
System.out.println("driver load successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Albatros01@");
System.out.println("database connected successfully");
Statement st= con.createStatement();
String ps= "select * from employees";

ResultSet rs= st.executeQuery(ps);
System.out.println(rs);
while(rs.next()){


%>
<table border="1">
<tr>

    <td><%=rs.getString("id") %></td>
    <td><%=rs.getString("email") %></td>
    <td><%=rs.getString("first_name") %></td>
    <td><%=rs.getString("last_name") %></td>
</tr>
</table>

<%
    }


%>

</body>
</html>