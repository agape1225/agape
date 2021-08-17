<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ysw02
  Date: 2021-01-31
  Time: 오후 7:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/admin/login/check.do" method="post">
    <h3>Form 데이터 로그인</h3>
    <input type="text" name="id" />
    <input type="password" name="pw" />
    <button>제출</button>
</form>
</body>
</html>
