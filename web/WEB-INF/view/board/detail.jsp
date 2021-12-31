<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글번호 ${requestScope.data.title}</title>
</head>
<body>
    <div class="msg" data-msg="${requestScope.msg}"></div>
    <c:if test="${sessionScope.loginUser.iuser == requestScope.data.writer}">
    <div id="btnContainer" data-iboard="${requestScope.data.iboard}">
        <a href="/board/mod?iboard=${requestScope.data.iboard}">
            <button>수정</button>
        </a>
        <button id="btnDel">삭제</button>
    </c:if>

    </div>
    <div>번호 : ${requestScope.data.iboard}</div>
    <div>제목 : <c:out value="${requestScope.data.title}"/></div>
    <div>내용 : <c:out value="${requestScope.data.ctnt}"/></div>
    <div>작성자 : <c:out value="${requestScope.data.writerNm}"/></div>
    <div>조회수 : ${requestScope.data.hit}</div>
    <div>작성일시 : ${requestScope.data.rdt}</div>
    <div>수정일시 : ${requestScope.data.mdt}</div>
    <script src="/res/js/board/detail.js?ver=1"></script>
</body>
</html>