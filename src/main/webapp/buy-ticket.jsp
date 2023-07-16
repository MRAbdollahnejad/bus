<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>buy ticket</title>
</head>
<body>
<form action="buy-ticket" method="post">

    <label for="select">enter your start city: </label>
    <select id="select" name="select">
        <option value="shahr-ekord">shahr-e kord</option>
        <option value="esfahan">esfahan</option>
        <option value="shiraz">shiraz</option>
    </select>

    <label for="select2">enter your destination city: </label>
    <select id="select2" name="select2" >
    <option value="shahr-ekord">shahr-e kord</option>
    <option value="esfahan">esfahan</option>
    <option value="shiraz">shiraz</option>
    </select>

    <label for="date"> enter the date </label>
<%--    front check--%>
    <input type="date" id="date" name="date" min="1402-01-01" max="1403-01-01">

    <input type="submit">

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
