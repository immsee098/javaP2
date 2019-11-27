<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>includeTest.jsp</title>
</head>
<body>
<h1>include 액션 태그 연습</h1>
<%
	String datePage = "date1.jsp";
%>
<h2>표현식 이용-include</h2>
<jsp:include page="<%=datePage %>"></jsp:include>

<h2>include</h2>
<jsp:include page="date1.jsp"></jsp:include>

<h2>파라미터 보내기 - include</h2>
<jsp:include page="date1.jsp">
	<jsp:param value="7" name="no"/>
	<jsp:param value="서초" name="addr"/>
</jsp:include>

<h2>include 지시자</h2>
<%@include file="date1.jsp" %>
<%
	//String str="hello";  //error
%>
</body>
</html>





