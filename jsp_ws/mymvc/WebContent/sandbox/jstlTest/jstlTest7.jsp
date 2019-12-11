<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlTest7.jsp</title>
<link rel="stylesheet" type="text/css" 
	href='<c:url value="/css/mainstyle.css" />'>
<script type="text/javascript" 
	src="<c:url value='/js/jquery-3.4.1.min.js'/>"></script>
</head>
<body>
<h1>url</h1>
<a href="<c:url value='/sandbox/jstlTest/jstlTest1.jsp' />">
	jstlTest1.jsp로 이동</a>
<br>
<hr>
<img src="<c:url value='/images/herb.JPG'/>">
<br>
<p>contextPath : ${pageContext.request.contextPath }</p>
<img src="${pageContext.request.contextPath }/images/good.jpg">	
<br>
<img src="<%=request.getContextPath()%>/images/herbLogo.jpg">

</body>
</html>






