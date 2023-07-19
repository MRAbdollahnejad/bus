<%@ page import="com.example.iranpeyma.entity.Ticket" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/18/2023
  Time: 2:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ticket information</title>
</head>
<body>
<form action="delete-ticket" method="post">
    <table border="1">
        <tr>
            <td>
                bus ticket information
            </td>
        </tr>
<%
    List<Ticket> ticketList =new ArrayList<>();
    List<Ticket> attribute = (List<Ticket>) request.getSession().getAttribute("tickets-by-user");
    ticketList.addAll(attribute) ;
    int index = Integer.parseInt(request.getParameter("index"));
    Ticket ticket= ticketList.get(index);
    HttpSession ticketIndexSession = request.getSession();
    ticketIndexSession.setAttribute("indexTwo",index);
%>
        <tr>
            <td> ticket code</td>
            <td><%=ticket.getUuid()%></td>
        </tr>
        <tr>
            <td>reserved for </td>
            <td><%=ticket.getOwner()%></td>
        </tr>
        <tr>
            <td>gender</td>
            <td><%=ticket.getGender()%></td>
        </tr>
        <tr>
            <td>start city </td>
            <td><%=ticket.getTrip().getStartCity().getCityName()%></td>
        </tr>
        <tr>
            <td>destination </td>
            <td><%=ticket.getTrip().getDestinationCity().getCityName()%></td>
        </tr>
        <tr>
            <td>date </td>
            <td><%=ticket.getTrip().getLocalDate()%></td>
        </tr>
        <tr>
            <td>time</td>
            <td><%=ticket.getTrip().getLocalTime()%></td>
        </tr>
        <tr>
            <td>trip code</td>
            <td><%=ticket.getTrip().getUuid()%></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="delete ticket">
            </td>
        </tr>

    </table>
</form>
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
