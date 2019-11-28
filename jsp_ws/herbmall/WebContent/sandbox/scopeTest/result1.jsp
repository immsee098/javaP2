<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result1.jsp - page영역</h1>
	<jsp:useBean id="vo" class="com.herbmall.test.CounterVO" 
		scope="page"></jsp:useBean>
	<p>	count = <jsp:getProperty property="count" name="vo"/>
	</p>	
	<hr>
	<a href="scope1.jsp">scope1.jsp로 이동</a>
</body>
</html>







