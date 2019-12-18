<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookWrite.jsp</title>
</head>
<body>
	<h1>등록</h1>
	<form name="frmWrite" method="post" action="<c:url value='/book/bookWrite.do'/>">
		책 이름: <input type="text" name="title"><br>
		가격: <input type="text" name="price"><br>
		출판사: <input type="text" name="publisher"><br>
		<input type="submit" value="등록">
	</form>
	
	<br>
	<a href="<c:url value='/book/bookList.do'/>">전체 목록</a>
</body>
</html>