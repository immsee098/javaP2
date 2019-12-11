<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>fmt-formatDate</h1>
	<c:set var="now" value="<%=new Date() %>"></c:set>
	<p>오늘 날짜 : ${now }</p>
	
	<p>
		time : <fmt:formatDate value="${now }" type="time"/>
	</p>
	<p>
		date : <fmt:formatDate value="${now }" type="date"/>
	</p>
	<p>
		both : <fmt:formatDate value="${now }" type="both"/>
	</p>
	<p>
		dateStyle - default : 
			<fmt:formatDate value="${now }" dateStyle="default"/>
	</p>
	<p>
		dateStyle - short : 
			<fmt:formatDate value="${now }" dateStyle="short"/>
	</p>
	<p>
		dateStyle - medium : 
			<fmt:formatDate value="${now }" dateStyle="medium"/>
	</p>
	<p>
		dateStyle - long : 
			<fmt:formatDate value="${now }" dateStyle="long"/>
	</p>
	<p>
		dateStyle - full : 
			<fmt:formatDate value="${now }" dateStyle="full"/>
	</p>
	<p>
		yyyy-MM-dd : <fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/>
	</p>
	<p>
		yyyy-MM-dd HH:mm:ss => 
		<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>
	</p>
	
	
		
</body>
</html>










