<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 22.04.2016
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body style="background: cyan">
  <form action="registration_page"; method="post">
    <span style="color: chocolate">Name:</span> <input type="text", name="name"> <br> </br>
    <span style="color: chocolate">Second name:</span> <input type="text", name="secondName"> <br> </br>
    <span style="color: chocolate">Email:</span> <input type="text", name="email"> <br> </br>
    <span style="color: chocolate">Country:</span>
    <select name="country">
      <option></option>
      <option>USA</option>
      <option>Canada</option>
      <option>New Zealand</option>
      <option>Germany</option>
      <option>England</option>
      <option>Norway</option>
      <option>Poland</option>
    </select> <br> </br>
    <span style="color: chocolate">Password:</span> <input type="password", name="password"> <br> </br>
    <input style="background: gold" type="submit" name="enter" value="Login">
  </form>
</body>
</html>
