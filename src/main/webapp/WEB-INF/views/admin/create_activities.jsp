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

<form action="/admin/create_activities/insert_activities.do" method="post" enctype="multipart/form-data">
    <h3>Form 데이터 로그인</h3>
    이름: <input type="text" name="name" /><br>
    분류: <input type="text" name="category" /><br>
    대상: <input type="text" name="target" /><br>
    날짜: <input type="date" name="date" /><br>
    링크: <input type="text" name="link" /><br>
    상금: <input type="text" name="benefits" /><br>
    주최기관: <input type="text" name="host" /><br>
    포스터: <input type="file" name="poster" /><br>
    <button>제출</button>
</form>
</body>
</html>
