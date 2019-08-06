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
    <title>注册</title>
</head>
<body>
<h1>注册</h1>
<form action="useradd.action" method="post" >
    姓名:<input type="text" name="user_Name">
    手机号:<input type="text" name="user_Tel">
    邮箱:<input type="text" name="user_Email">
    <input type="submit" value="提交">
</form>
<br/>
<form action="login.action" method="post" >
    姓名:<input type="text" name="user_Name">
    密码:<input type="text" name="user_Password">

    <input type="submit" value="登录">
</form>
<br/>
<form action="register.action" method="post" >
    密码：<input type="text" name="user_Password">
    姓名:<input type="text" name="user_Name">
    手机号:<input type="text" name="user_Tel">
    邮箱:<input type="text" name="user_Email">
    <input type="submit" value="注册">
</form>
<br/>

<form action="forgetuser_Password.action" method="post">
    手机号:<input type="text" name="phone">
    <input type="submit" value="修改密码">

</form>

<form action="accept.action" method="post" >
    手机号:<input type="text" name="phone">
    <input type="submit" value="获取验证码">
    验证码:<input type="text" name="message">
    <input type="submit" value="提交">

</form>

<form action="acceptcode.action" method="post">
    手机号:<input type="text" name="phone">
    验证码:<input type="text" name="message">
    <input type="submit" value="提交">
</form>
<br/>

<form action="forgetuser_Password.action" method="post">
    手机号：<input type="text" name="user_Tel">
    修改密码:<input type="text" name="user_Password">
    <input type="submit" value="提交">
</form>
</body>

</html>
