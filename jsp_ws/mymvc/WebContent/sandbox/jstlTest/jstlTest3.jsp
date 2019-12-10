<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>foreach</h1>
<h2>1~100 사이의 짝수의 합</h2>
<c:set var="sum" value="0" />
<c:forEach var="i" begin="1" end="100">
	<c:if test="${i%2==0 }">
		<c:set var="sum" value="${sum+i }" />
		i => <c:out value="${i }"></c:out>
		<br>	
	</c:if>
</c:forEach>

<p>짝수 합 : ${sum }</p>
<hr>

<h2>확장 for</h2>
<c:forEach var="head" items="${headerValues }">
	<p>key : ${head.key }</p>
	<%-- <p>value : ${head.value }</p> --%>
	<c:forEach var="val" items="${head.value }">
		<p>value => ${val }</p><br>
	</c:forEach>
</c:forEach>

<h2>짝수의 합 - step 이용</h2>
<c:set var="sum" value="0" />
<c:forEach var="i" begin="2" end="100" step="2">
	<c:set var="sum" value="${sum+i }" />	
</c:forEach>
<p>결과 : ${sum }</p>

<h2>기존 방식</h2>
<%
	Enumeration en=request.getHeaderNames();
	while(en.hasMoreElements()){
		String key=(String)en.nextElement();
		String val=request.getHeader(key);
		out.print(key+" => "+ val+"<br>");
	}
%>
</body>
</html>




