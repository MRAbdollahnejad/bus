<%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/17/2023
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    response.getWriter().println("not allowed to have more than one ticket with same way and national code");
%>
<%
    if (session.getAttribute("username") == (null)) {
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>
