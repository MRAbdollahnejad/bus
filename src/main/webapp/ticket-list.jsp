<%@ page import="com.example.iranpeyma.entity.Trip" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.time.LocalTime" %><%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/16/2023
  Time: 12:34 PM
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
    List<Trip> trips = new ArrayList<>((Collection<Trip>) session1.getAttribute("trips"));
%>
    <table border="1">
        <tr>
            <th> way : <%=
                trips.get(0).getStartCity().getCityName() +" to " +
                        trips.get(0).getDestinationCity().getCityName()
            %> </th>
            <th> date : <%=
                trips.get(0).getLocalDate().toString()
            %></th>
        </tr>
        <tr>
            <td>choose</td>
            <td>move time</td>
            <td>trip code</td>
        </tr>
        <%for (int i = 0; i < trips.size(); i++) {%>
        <tr>
            <td>
                <form action="chose-ticket" method="post">
                    <button type="submit" name="index" value="<%=i%>"> buy </button>
                </form>
            </td>
            <td>
                <%=trips.get(i).getLocalTime()%>
            </td>
            <td>
                <%=trips.get(i).getUuid()%>
            </td>
        </tr>
        <%}%>

    </table>

</body>
</html>
