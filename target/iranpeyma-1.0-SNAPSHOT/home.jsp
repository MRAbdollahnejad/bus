<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body{
        background-color: gray;
        font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        font-size: xx-large;
    }
    input{
        width: 10rem;
        height: 3rem;
    }
</style>
<body>
<%
    if (session.getAttribute("username") == (null)) {
        response.sendRedirect("login.jsp");
    }
%>
<a href="buy-ticket.jsp">buy ticket</a>
<br>
<a href="${pageContext.request.contextPath}/reserved-tickets">see all ticket</a>

<form action="logout" method="post">
    <input type="submit" value="logout">
</form>
</body>
</html>
