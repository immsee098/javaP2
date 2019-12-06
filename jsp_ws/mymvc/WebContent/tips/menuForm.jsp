<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>점심 메뉴 추천</h1>
<form name="frm3" method="post" action="<%=request.getContextPath()%>/menu.do">
	<select name="menu">
		<option value="양식">양식</option>
		<option value="한식">한식</option>
		<option value="일식">일식</option>
		<option value="기타">기타</option>
	</select>
</form>

</body>
</html>