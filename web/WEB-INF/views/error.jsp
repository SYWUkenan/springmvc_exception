<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021-07-10
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
服务出错了！
<div style="display: none;"><%= ((Exception)request.getAttribute("ex")).getMessage() %></div>

</body>
</html>
