<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 23.04.2016
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body style="background: cyan">

   <h3 style="color: darkgreen">Your info:</h3>
   <span style="color: darkgoldenrod">Name: </span> <span style="color: mediumblue">${dataFromForm.name}</span> <br> </br>
   <span style="color: darkgoldenrod">Second name: </span> <span style="color: mediumblue">${dataFromForm.secondName}</span> <br> </br>
   <span style="color: darkgoldenrod">Email: </span> <span style="color: mediumblue">${dataFromForm.email}</span> <br> </br>
   <span style="color: darkgoldenrod">Country: </span> <span style="color: mediumblue">${dataFromForm.country}</span> <br> </br>
   <span style="color: darkgoldenrod">Password: </span> <span style="color: mediumblue">${dataFromForm.password}</span> <br> </br>

   <a href="http://localhost:8080/filedownload">Download your data</a>

</body>
</html>
