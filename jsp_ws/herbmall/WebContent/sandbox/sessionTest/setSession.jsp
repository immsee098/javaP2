<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션에 저장하기</h1>
	<%
		session.setAttribute("id", "hong1");
		session.setAttribute("pwd", "123");
		
	%>
	<p>세션에 저장함</p>
	<p>session id : <%=session.getId() %></p>
	<br>
	<a href="useSession.jsp">useSession.jsp로 이동</a>
	
</body>
</html>

