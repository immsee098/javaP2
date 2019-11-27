<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>applicationTest.jsp</title>
</head>
<body>
	<h1>application 객체</h1>
	<p>/ 의 실제 물리적인 경로 : <%=application.getRealPath("/") %></p>
	<p>웹컨테이너의 정보 : <%=application.getServerInfo() %></p>
	<p>서블릿버전 : <%=application.getMajorVersion() %>.
				<%=application.getMinorVersion() %></p>
	
</body>
</html>







