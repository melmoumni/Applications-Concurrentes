<%--
  Created by IntelliJ IDEA.
  User: mohammed
  Date: 11/11/15
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<br>
<head>
    <title>Profile</title>
</head>
<br>
First name : <c:out value="${authCtrl.currentUser.firstName}"/> <br>
Last name : <c:out value="${authCtrl.currentUser.lastName}"/> <br>
Number of access : <c:out value="${authCtrl.currentUser.access}"/> <br>
Password : <c:out value="${authCtrl.currentUser.psswd}"/> <br>
</body>
</html>
