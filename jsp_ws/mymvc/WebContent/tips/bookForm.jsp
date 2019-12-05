<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tips/bookForm.jsp</title>
</head>
<body>
<h1>프로그래밍 언어를 선택하시면 책을 추천합니다.</h1>
<form name="frm" method="post" 
	action="<%=request.getContextPath()%>/book.do">
	<select name="lang">
		<option value="java">java</option>
		<option value="jsp">jsp</option>
		<option value="c">c</option>
		<option value="oracle">oracle</option>
	</select>
	<br><br>
	<input type="submit" value="확인">
</form>
</body>
</html>






