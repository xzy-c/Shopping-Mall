<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/7/19
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h2>用户登录</h2>
<form  action="/user/login.action"  method="post">
    用户名：<input type="text" name="user_Name"><br>
    密码：<input type="text" name="user_Password"><br>
    <input type="submit" value="提交登录">
</form>
</body>
</html>
