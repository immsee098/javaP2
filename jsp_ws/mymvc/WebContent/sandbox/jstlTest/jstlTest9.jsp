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
	<h1>fmt-formatNumber</h1>
	<c:set var="num" value="12345.678" />
	
	<p>12345.678</p>
	<p>
		number => <fmt:formatNumber value="${num }" type="number" />		
	</p>
	<p>
		currency => <fmt:formatNumber value="${num }" type="currency" 
			currencySymbol="$" />		
	</p>
	<p>
		percent => <fmt:formatNumber value="${num }" type="percent" />		
	</p>
	<p>
		.0 => <fmt:formatNumber value="${num }" pattern=".0" />		
	</p>
	<p>
		#,### => <fmt:formatNumber value="${num }" pattern="#,###" />		
	</p>
	<p>
		#,### => <fmt:formatNumber value="12345.678" pattern="#,###" />		
	</p>
	
	
	
</body>
</html>





