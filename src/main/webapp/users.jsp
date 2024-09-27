<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User List</title>
</head>
<body>
<h1>User List</h1>

<ul>
    <!-- 사용자 목록을 출력 -->
    <c:forEach var="user" items="${users}">
        <li>${user}</li>
    </c:forEach>
</ul>

</body>
</html>
