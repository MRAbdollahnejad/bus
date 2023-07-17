<%--
  Created by IntelliJ IDEA.
  User: mrabd
  Date: 7/17/2023
  Time: 5:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="create-ticket" method="post">
    <label> enter your name :
        <input type="text" name="name" autocomplete="off" required>
    </label>
    <br>
    enter your gender : <br>
    <label> man
        <input type="radio" name="gender" value="man" required>
    </label>
    <br>
    <label>woman
        <input type="radio" name="gender" value="woman">
    </label>
    <br>
    <input type="submit">

</form>

</body>
</html>
