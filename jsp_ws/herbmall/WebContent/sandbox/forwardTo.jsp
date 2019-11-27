<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forwardTo.jsp</title>
</head>
<body>
	<h1>forwardTo.jsp 페이지입니다.</h1>
	<%
		request.setCharacterEncoding("utf-8");
	
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		String address=(String)request.getAttribute("address");
	%>
	<p>id=<%=id %></p>
	<p>pwd=<%=pwd %></p>
	<p>address=<%=address %></p>
</body>
</html>


