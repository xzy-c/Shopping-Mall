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
    <title>测试</title>
</head>
<body>
<h1>Test</h1>
<form action="useradd.action" method="post">
    id:<input type="text" name="user_Id">
    姓名:<input type="text" name="user_Name">
    **邮箱:<input type="text" name="user_Email78">
    <input type="submit" value="提交">
</form>
<form action="find.action" method="post">
    use_Id:<input type="text" name="use_Id">

<input type="submit" value="提交">
</form>

<form action="delete.action" method="post">
    <input type="submit" value="查询">
</form>
</body>
</html>
