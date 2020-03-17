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
<%--    <h3>hello world</h3>
    <a href="hello">first day1</a>
    <form action="param/save" method="post">
        姓名：<input type="text" name="username" /><br>
        密码：<input type="text" name="password" /><br>
        金额：<input type="text" name="money" /><br>

        地址：<input type="text" name="list[0].address" /><br>
        电话：<input type="text" name="list[0].phone" /><br>

        地址：<input type="text" name="map['地址'].address" /><br>
        电话：<input type="text" name="map['地址'].phone" /><br>
        <input type="submit" value="提交">
    </form>--%>

<%--    <form action="param/saveDetail" method="post">
        地址：<input type="text" name="address" /><br>
        电话：<input type="text" name="phone" /><br>
        日期：<input type="text" name="date" /><br>
        <input type="submit" value="提交">
    </form>--%>

    <%--<a href="servletapi">testapi</a>--%>

        <a href="testParam/PathVariable/1">test</a>

    <br>
    <form action="testParam/testModelAttribute" method="post">
        地址：<input type="text" name="address" /><br>
        <input type="submit" value="提交">
    </form>
    <br>
    <a href="testParam/testSessionAttribute">testSession</a>
    <a href="testParam/getSessionAttribute">testSession</a>
    <a href="testParam/deleteSessionAttribute">testSession</a>
</body>
</html>
