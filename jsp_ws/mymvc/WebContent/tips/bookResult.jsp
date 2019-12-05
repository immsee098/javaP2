<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookResult.jsp</title>
</head>
<body>
<%
	String result=(String)request.getAttribute("result");
%>
	<h1>뷰 페이지 </h1>
	<p>책 추천 : <%=result %></p>
	
</body>
</html>








