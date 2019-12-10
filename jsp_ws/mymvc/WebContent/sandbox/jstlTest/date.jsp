<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>date.jsp</title>
</head>
<body>
	<%
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str=sdf.format(d);
		
		request.setCharacterEncoding("utf-8");
		
		String address=request.getParameter("addr");
		String no=request.getParameter("no");		
	%>
	<hr>
	<h2>오늘 날짜</h2>
	<p><%=str %></p>
	
	<h2>파라미터</h2>
	<p>주소:<%=address %></p>	
	<p>번호:<%=no %></p>	
</body>
</html>

