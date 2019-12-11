<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>fn - jstl 함수</h1>
	<c:set var="str" value="abcd"></c:set>
	<p>str 변수의 값 : ${str }</p>
	
	<h2>replace - a를 A로 치환</h2>
	<p>${fn:replace(str,'a','A') }</p>
	<p>${fn:replace("java",'a','A') }</p>
	
	<h2>indexOf - b의 위치</h2>
	<p>${fn:indexOf(str,'b') }</p>
	
	<h2>substring - 월만 추출</h2>
	<c:set var="birth" value="1999-01-02"></c:set>
	<p>birth변수의 값  : ${birth }</p>
	<p>${fn:substring(birth, 5,7) }</p>
	
	<h2>split</h2>
	<c:set var="result" value="${fn:split(birth, '-') }"></c:set>
	
	<p>
		${result[0] }년 ${result[1] }월 ${result[2] }일
	</p>
	
</body>
</html>



