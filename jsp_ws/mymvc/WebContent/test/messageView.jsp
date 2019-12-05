<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test/messageView.jsp</title>
</head>
<body>
	<h1>view 페이지</h1>
	<%
		String result=(String)request.getAttribute("result");		
	%>
	<p>인사말 : <%=result %></p>
</body>
</html>