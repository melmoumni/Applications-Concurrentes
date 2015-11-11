<%--
  Created by IntelliJ IDEA.
  User: mohammed
  Date: 11/11/15
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/TP04/meteo/login" method="post">
    <input type="text" name="firstname" placeholder="First Name" required="true">
    <input type="text" name="lastname" placeholder="Last Name" required="true">
    <input type="password" name="psswd" placeholder="Password" required="true">
    <input type="submit" value="Log in">
</form>

</body>
</html>
