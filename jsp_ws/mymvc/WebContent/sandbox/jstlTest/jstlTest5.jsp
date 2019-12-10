<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlTest5.jsp</title>
</head>
<body>
<c:import url="date.jsp" var="today"></c:import>
<h1>import 이용</h1>
${today }

<h1>import - 파라미터 전달</h1>
<c:import url="/sandbox/jstlTest/date.jsp">
	<c:param name="addr" value="서초동"></c:param>
	<c:param name="no" value="4"></c:param>
</c:import>


</body>
</html>




