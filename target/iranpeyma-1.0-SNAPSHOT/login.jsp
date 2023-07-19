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
<style>
    body{
        background-color: lightgreen;
    }
    div{
        align-content: center;
        align-items: center;
        background-color: forestgreen;
        display: flex;
        padding: 5%;
        width: 20rem;
        margin: auto;
        margin-top: 5%;
        border-radius: 10px;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        color: azure;
    }
    input{
        padding: 5%;
        margin: 5%;
        align-items: center;
        align-content: center;
    }
</style>
<body>
<div>
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
</div>


</body>
</html>
