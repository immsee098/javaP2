<%@page import="com.herbmall.test.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sandbox/singletonTest.jsp</title>
</head>
<body>
<h1>싱글톤 패턴 연습</h1>
<%
	//Person p = new Person();//error
	Person p = Person.getInstance();
	p.showInfo();
%>

</body>
</html>