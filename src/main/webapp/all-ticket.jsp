<%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/16/2023
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>see all tickets</title>
</head>
<body>
<%
    if (session.getAttribute("username") == (null)) {
        response.sendRedirect("login.jsp");
    }
%>
<form action="logout" method="post">
    <input type="submit" value="logout">
</form>

</body>
</html>
