<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션 값 읽어오기</h1>
	<%
		String id=(String)session.getAttribute("id");
		String pwd=(String)session.getAttribute("pwd");
		
	%>
	<h2>id => <%=id %></h2>
	<h2>pwd => <%=pwd %></h2>
	<p>세션 아이디 : <%=session.getId() %></p>
	<p>세션 유지시간 : <%=session.getMaxInactiveInterval() %>초</p>
	
	<a href="logout.jsp">logout</a>
</body>
</html>


