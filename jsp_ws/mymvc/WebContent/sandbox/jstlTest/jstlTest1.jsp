<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlTest/jstlTest1.jsp</title>
</head>
<body>
<h1>JSTL - set, out, remove</h1>
<c:set var="browser" value="${header['user-agent'] }" />
<h2>el표현식 이용-출력</h2>
${browser }
<h2>jstl - out 이용</h2>
<c:out value="${browser }" />

<c:remove var="browser"/>

<h2>제거 후</h2>
${browser }

</body>
</html>










