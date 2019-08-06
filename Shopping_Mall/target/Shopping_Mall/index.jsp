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
    <title>种草</title>
</head>
<body>
<h1>种草了昂</h1>
<form action="##" method="post">
    封面:<input type="image" src="" name="cover">
    图片:<input type= "image" src="./img/1.jpg" name="im" >
    用户Id<input type="text" src="" name="user_Id">
    商品Id<input type="text" src="" name="goods_Id">
    点赞数<input type="text" src="" name="likes">
    <input type="text" src="" name="cover">
    <input type="text" src="" name="collections">

    标题:<input type="text" name="title">
    内容:<input type="text" name="description">

    <input type="submit" value="提交">
</form>
<form action="/up.action" method="post">
    <h1><input type="number" name="seeds_Id" value="3"> </h1>
    <input type="submit" value="Up">
</form>
<form action="/like.action"><h1><input type="submit" value="<index>"></h1></form>

</body>
</html>
