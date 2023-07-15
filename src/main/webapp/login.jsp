<%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/15/2023
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action="login" method="post">
    enter your username:
    <label>
        <input type="text" name="username" autocomplete="off" >
    </label> <br>
    enter your password:
    <label>
        <input type="password" name="pass" autocomplete="off">
    </label><br>
    <input type="submit">
</form>

</body>
</html>
