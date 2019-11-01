<%--
  Created by IntelliJ IDEA.
  User: 苏强
  Date: 2019/8/19
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>
            <td>生日</td>
            <td>爱好</td>
        </tr>
        <c:forEach items="${list}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.pwd}</td>
                <td>${u.shengri}</td>
                <td>${u.aihao}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
