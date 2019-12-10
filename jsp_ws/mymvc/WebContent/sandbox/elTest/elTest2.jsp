<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elTest2.jsp</title>
</head>
<body>
<%	
	request.setCharacterEncoding("utf-8");
%>

<h1>param 내장 객체 사용</h1>
<form action="elTest2.jsp" name="frm" method="post">
	이름 : <input type="text" name="name" value="${param['name'] }"><br>
	주소 : <input type="text" name="address" value="${param.address }"><br><br>
	<input type="submit" value="전송">
</form>

<%
	//기존 방식
	String name=request.getParameter("name");
	String address=request.getParameter("address");	
%>
<h2>기존 방식 - 파라미터 값</h2>
<p>name : <%=name %></p>
<p>address : <%=address %></p>
<br>
<hr>
<h2>el 표현식 이용</h2>
<p>이름 - ${param.name }</p>
<p>주소 - ${param['address'] }</p>

</body>
</html>


