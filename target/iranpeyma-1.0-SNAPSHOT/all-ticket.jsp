<%@ page import="java.util.List" %>
<%@ page import="com.example.iranpeyma.entity.Ticket" %>
<%@ page import="java.util.ArrayList" %><%--
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
all tickets here:
<table border="1">
    <tr>
        <th>
            choose
        </th>
        <th>
            ticket code
        </th>
        <th>
            date
        </th>
    </tr>

<%
    List<Ticket> ticketList =new ArrayList<>();
    List<Ticket> attribute = (List<Ticket>) request.getSession().getAttribute("tickets-by-user");
    ticketList.addAll(attribute) ;
    for (int i = 0; i <ticketList.size() ; i++) {
        %>

    <tr>
        <td>
            <form action="${pageContext.request.contextPath}/ticket-info.jsp" method="post">
                <button type="submit" name="index" value="<%=i%>"> choose </button>
            </form>
        </td>
        <td>
            <%=ticketList.get(i).getUuid()%>
        </td>
        <td>
            <%=ticketList.get(i).getTrip().getLocalDate()%>
        </td>
    </tr>

<%
    }
%>

</table>

















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
