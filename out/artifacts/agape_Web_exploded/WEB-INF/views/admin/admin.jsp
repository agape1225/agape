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
<h1> admin </h1>
<form action="/admin/create_activities">
    <button>강의 추가</button>
</form>
<%--<img src="resources\activities_poster\4기 성창규 프로필사진.jpg">--%>
<div class="dataList">
    <div class="data">
        <ul>
            <c:forEach varStatus="i" var="item" items="${activities}">
                <li class="data">
                    <p style="display: inline">${item.name}</p>
                    <img src="${item.poster}">
                    <button onclick="location.href='/admin/delete_activities.do?number=${item.num}'">삭제</button>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>
