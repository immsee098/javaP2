<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlTest2.jsp</title>
</head>
<body>
<h1>if, choose~when~otherwise</h1>
<c:set var="country" value="korea" />
<h2>if 이용</h2>
<c:if test="${!empty country }">
	<p>${country }에서 살아요</p>
</c:if>
<c:if test="${empty country }">
	<p>변수에 값이 없습니다!!</p>
</c:if>
<hr>
<h2>choose 이용</h2>
<c:choose>
	<c:when test="${country=='korea' }">
		<p>한국 ${country }에서 삽니다.</p>
	</c:when>
	<c:when test="${country=='canada' }">
		<p>캐나다 ${country }에서 삽니다.</p>
	</c:when>
	<c:otherwise>
		<p>그외의 나라 ${country }에서 삽니다.</p>
	</c:otherwise>
</c:choose>
</body>
</html>



