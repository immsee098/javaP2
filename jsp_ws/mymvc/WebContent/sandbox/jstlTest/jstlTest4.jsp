<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlTest4.jsp</title>
</head>
<body>
<h1>forTokens</h1>
<c:forTokens var ="lang" delims="," items="java, jsp, oracle, spring">
	<p>${lang }</p>
</c:forTokens>



</body>
</html>






