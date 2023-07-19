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
<style>
   .form{
       background-color: aquamarine;
   }
</style>
<body>

<form action="create-ticket" method="post" class="form">
    <label> enter your name :
        <input type="text" name="name" autocomplete="off" required>
    </label>
    <br>
    <label> enter your national code :
        <input type="text" name="national-code" autocomplete="off" required>
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



    <%
        if (session.getAttribute("username") == (null)) {
            response.sendRedirect("login.jsp");
        }
    %>



</body>
</html>
