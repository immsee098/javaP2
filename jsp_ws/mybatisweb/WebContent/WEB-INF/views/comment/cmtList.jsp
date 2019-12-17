<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>comment/cmtList.jsp</title>
</head>
<body>
<h1>comment 목록</h1>
<table border="1">
	<tr>
		<td>번호</td>
		<td>아이디</td>
		<td>등록일</td>
		<td>내용</td>
	</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.commentNo }</td>
			<td>${vo.userId }</td>
			<td>${vo.regDate }</td>
			<td>${vo.commentContent }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>