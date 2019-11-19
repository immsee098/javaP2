<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>register_ok.jsp</title>
</head>
<body>
<%
	//post방식
	//요청 파라미터에 대한 한글 인코딩 처리
	request.setCharacterEncoding("euc-kr");

	//요청 파라미터 읽어오기
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	String name=request.getParameter("name");	
	String hp=request.getParameter("hp");	
%>

	<h1>post방식 - 요청 파라미터 값</h1>
	<p>id - <%=id %></p>
	<p>pwd - <%=pwd %></p>
	<p>name - <%=name %></p>
	<p>hp - <%=hp %></p>	
	
	
</body>
</html>




