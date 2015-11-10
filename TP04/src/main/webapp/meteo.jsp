<%--
  Created by IntelliJ IDEA.
  User: mohammed
  Date: 11/11/15
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Meteo</title>
</head>
<body>
<form action="/TP04/meteo" method="post">
    <input type="text" name="city" placeholder="Ville" required="true">
    <input type="submit" value="Chercher">
</form>
<c:if test="${not empty requestScope.temperature and not empty requestScope.city}">
    Il fait <c:out value="${requestScope.temperature}"/> à <c:out value="${requestScope.city}"/>
</c:if>

</body>
</html>
