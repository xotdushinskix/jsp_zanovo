<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 22.04.2016
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body style="background: mediumspringgreen">
  <h2 style="color: grey">
    You have opportunity to display your info. <br>
    Please, choose registration item:
  </h2>
  <form action="delimeter_info" method="post">
    <input type="submit" name="get_full_info" value="Get Full Info" />
    <input type="submit" name="get_single_info" value="Get Single Info" />
  </form>
</body>
</html>
