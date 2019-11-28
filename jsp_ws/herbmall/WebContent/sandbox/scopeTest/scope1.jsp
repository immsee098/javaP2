<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope1.jsp - page 영역 테스트</h1>
	<jsp:useBean id="vo" class="com.herbmall.test.CounterVO" 
		scope="page"></jsp:useBean>
	<jsp:setProperty property="count" name="vo"/>
	
	<h2>count => <jsp:getProperty property="count" name="vo"/> </h2>
	<br>
	<a href="result1.jsp">result1.jsp로 이동</a>	
</body>
</html>









