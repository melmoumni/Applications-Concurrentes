<%--
  Created by IntelliJ IDEA.
  User: mohammed
  Date: 10/11/15
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a user</title>
</head>
<body>
<h1>Create a user</h1>
<form action='/TP04/meteo/create-user' method='POST'>
    <input type='text' name='firstname' placeholder='First Name' required='true'>
    <input type='text' name='lastname' placeholder='Last Name' required='true'>
    <input type='submit' value='create'>
</form>
</body>
</html>
