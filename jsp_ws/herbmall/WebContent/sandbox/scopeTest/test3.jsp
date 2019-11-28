<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sandbox/scopeTest/test3.jsp</title>
</head>
<body>
	<h1>session 영역 연습 - test3.jsp</h1>
	<form name="frm" method="post" action="scope3.jsp">
		count : <input type="text" name="count"><br><br>
		<input type="submit" value="전송">
	</form>
	<br>
	<hr>
	<p>session id : <%=session.getId() %></p>
	
</body>
</html>





