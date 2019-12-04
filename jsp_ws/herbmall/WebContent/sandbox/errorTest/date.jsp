<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>  
<!-- 에러가 발생되면 에러를 처리하는 페이지인 error.jsp 에서 처리함 -->
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorTest/date.jsp</title>
</head>
<body>
<h1>date.jsp 페이지</h1>
<%
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String str=sdf.format(d);
%>
<h2>현재 날짜</h2>
<p><%=st %></p> <!-- 고의로 에러 발생시킴 -->
</body>
</html>









