<%@ page import="java.util.Objects" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.example.iranpeyma.entity.Ticket" %>
<%@ page import="com.example.iranpeyma.entity.enums.Gender" %><%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/17/2023
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    String username = (String) session1.getAttribute("username");

    Ticket ticket = (Ticket) request.getSession().getAttribute("ticket");
    String prefix;
    if (ticket.getGender().equals(Gender.MAN)){
        prefix="Mr.";
    }else prefix="Mrs.";

%>
<%=username %> you bought ticket successfully!
<br>
<%= "ticket reserved for " + prefix + ticket.getOwner()%>
<br>
<%="ticket code : " + ticket.getUuid()%>

<form action="home.jsp" method="post">
    <input type="submit" value="home">










</form>
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
