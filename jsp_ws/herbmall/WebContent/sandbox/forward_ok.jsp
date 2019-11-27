<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward_ok.jsp</title>
</head>
<body>
	<h1>forward_ok.jsp 페이지</h1>
	
	<%
		request.setAttribute("address", "서초");
	%>
	<jsp:forward page="forwardTo.jsp"></jsp:forward>
	<!-- forward액션태그와 include 액션태그는 request를 공유함
	=> 현재 페이지와 forwardTo.jsp 페이지는 동일한 request를 사용(request 공유)
	 -->
</body>
</html>




