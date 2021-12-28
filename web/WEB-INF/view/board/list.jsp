<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>리스트</title>
</head>
<body>
    <h1>리스트</h1>
    <div>
        <a href="/board/write">글쓰기</a>
    </div>

    <c:choose>
        <c:when test="${fn:length(requestScope.list) == 0}">
            아무글없다
        </c:when>
        <c:when test="${fn:length(requestScope.list) != 0}">
            글이있다
        </c:when>
    </c:choose>
</body>
</html>