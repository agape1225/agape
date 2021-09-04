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
    <link rel="stylesheet" href="/resources/css/bootstrap.css">
    <script type="text/javascript" src="/resources/js/bootstrap.js">
        $('.carousel').carousel()
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap.js"></script>
    <title>Title</title>
</head>
<body>
<h6>Hello, World</h6>

<div class="dataList">
    <div class="data">
        <ul>
            <c:forEach varStatus="i" var="item" items="${activities}">
                <li class="data">
                    <p style="display: inline">${item.name}</p>
                    <img src="${item.poster}">
                </li>
            </c:forEach>
        </ul>
    </div>
</div>

</body>
</html>
