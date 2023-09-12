<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form method="post" action="/myservlet/main.HelloServlet">
    name:<input type="text" name="nav"> </br>
    password:<input type="password"> </br>
    <input type="submit">
</form>
</body>
</html>