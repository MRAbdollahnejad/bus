<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.getAttribute("username") == (null)) {
        response.sendRedirect("login.jsp");
    }
%>
<%--Todo--%>
<a href="buy-ticket.jsp">buy ticket</a>

<a href="all-ticket.jsp">see all ticket</a>

<form action="logout" method="post">
    <input type="submit" value="logout">
</form>
</body>
</html>
