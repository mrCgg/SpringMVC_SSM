<%--
  Created by IntelliJ IDEA.
  User: 16973
  Date: 2019/6/23
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>hello world</h3>
    <a href="hello">first day1</a>
    <form action="param/save" method="post">
        姓名：<input type="text" name="username" /><br>
        密码：<input type="text" name="password" /><br>
        金额：<input type="text" name="money" /><br>
        地址：<input type="text" name="detail.address" /><br>
        电话：<input type="text" name="detail.phone">
        <input type="submit" value="提交">
    </form>

</body>
</html>
