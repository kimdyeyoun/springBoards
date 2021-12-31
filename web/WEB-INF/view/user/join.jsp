<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<div>
    <form action="/user/join" method="post">
        <div><input type="text" name="uid" placeholder="id" required></div>
        <div><input type="password" name="upw" placeholder="password" required></div>
        <div><input type="text" name="nm" placeholder="name" required></div>
        <div>
            <label>female<input type="radio" value="2" name="gender" checked></label>
            <label>male<input type="radio" value="1" name="gender"></label>
        </div>
        <div>
            <input type="submit" value="join">
            <input type="reset" value="reset">
        </div>
    </form>
</div>
<script src="/res/js/user/join.js"></script>