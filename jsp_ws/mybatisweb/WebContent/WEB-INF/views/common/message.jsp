<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>common/message.jsp</title>
</head>
<body>
	<%
		//String msg=(String)request.getAttribute("msg");
		//String url=(String)request.getAttribute("url"); //=> /index.do
		
		//String contextPath=request.getContextPath(); //=> /mymvc
		//url=contextPath+url;  //=> /mymvc/index.do		
	%>
	
	<script type="text/javascript">
		alert("${msg}");
		location.href="<c:url value='${url}'/>";
	</script>
</body>
</html>






