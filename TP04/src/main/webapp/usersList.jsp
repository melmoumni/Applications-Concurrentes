<%--
  Created by IntelliJ IDEA.
  User: mohammed
  Date: 10/11/15
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <titlle>Users List</title>
</head>
<body>
<h1>Users List</h1>
<c:forEach items="${requestScope.usersList}" var="user">
    <c:out value="${user.firstName}"/>
    <c:out value="${user.lastName}"/></body></br>
</c:forEach>
<a href='/TP04/meteo/create-user'>New</a>
</body>
</html>
