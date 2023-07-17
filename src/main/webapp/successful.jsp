<%@ page import="java.util.Objects" %>
<%@ page import="java.util.Arrays" %><%--
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
%>
<%=username %> you bought ticket successfully!


</body>
</html>
