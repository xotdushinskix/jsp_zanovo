<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 24.04.2016
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="give_user_single_info" method="post">
    <select name="regItem">
    <option></option>
    <option>name</option>
    <option>second_name</option>
    <option>email</option>
    <option>country</option>
    <option>password</option>
    </select> <br> </br>
    <input type="submit" value="Get single info" />
  </form>
</body>
</html>
