<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result3.jsp - session영역</h1>
	<jsp:useBean id="vo" class="com.herbmall.test.CounterVO" 
		scope="session"></jsp:useBean>
	<p>	count = <jsp:getProperty property="count" name="vo"/>
	</p>	
	<hr>
	<a href="scope3.jsp">scope3.jsp로 이동</a>
	<br>
	<hr>
	<p>session id : <%=session.getId() %></p>
	<p>session 유지시간 : <%=session.getMaxInactiveInterval() %>초</p>
	
</body>
</html>







