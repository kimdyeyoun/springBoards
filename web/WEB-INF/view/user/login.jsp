<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body>
<c:if test="${requestScope.msg != null}">
    <div>${requestScope.msg}</div>
</c:if>
<div class="wrap">
    <div>
        <form action="/user/login" method="post" id="frm">
            <div><input type="text" name="uid" placeholder="id" value="트월킹좌4"></div>
            <div><input type="password" name="upw" placeholder="password" value="qwe12"></div>
            <div><input type="submit" value="login"></div>
        </form>
        <div>
            <a href="/user/join">join</a>
        </div>
    </div>
</div>
</body>
</html>