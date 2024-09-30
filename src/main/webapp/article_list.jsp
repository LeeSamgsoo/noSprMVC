<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일</th>
    </tr>
  </thead>
  <tbody>
        <c:forEach var="article" items="${articles}">
            <tr>
                <td>${article.id}</td>
                <td>${article.title}</td>
                <td>${article.author}</td>
                <td>  <c:if test="${article.createdDate != null}">  <fmt:formatDate value="${article.createdDate}" pattern="yyyy-MM-dd"/>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
  </tbody>
</table>
</body>
</html>

