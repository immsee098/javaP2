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
	//post���
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");

	//��û �Ķ���� �о����
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	String name=request.getParameter("name");	
	String hp=request.getParameter("hp");	
%>

	<h1>post��� - ��û �Ķ���� ��</h1>
	<p>id - <%=id %></p>
	<p>pwd - <%=pwd %></p>
	<p>name - <%=name %></p>
	<p>hp - <%=hp %></p>	
	
	
</body>
</html>




