<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sony
  Date: 25/01/2018
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookStore</title>
</head>
<body>
<div style=""></div>
<c:forEach items="${bookList}" var="item">
    <div class="col-md-4">
        <div class="thumbnail">
            <%--<a href="${pageContext.request.contextPath}/salons/salon?salonId=${item.salonId}" target="_blank">--%>
                <div class="caption">
                    <br>
                    <p style="font-size: 20px; font-weight: bold;">${item.title}</p>
                    <p style="font-size: 20px; font-weight: bold;">${item.author}</p>
                    <p style="font-size: 20px; font-weight: bold;">${item.genre}</p>
                    <p style="font-size: 20px; font-weight: bold;">${item.publicationDate}</p>
                </div>
            </a>
        </div>
    </div>
</c:forEach>
</body>
</html>
