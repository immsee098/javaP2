<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlTest8.jsp</title>
</head>
<body>
<h1>jstl fmt</h1>
<h2>requestEncoding</h2>
<fmt:requestEncoding value="utf-8"/>

<form name="frm" method="post" action="jstlTest8.jsp">
	아이디 : <input type="text" name="userid" value="${param.userid }"><br>
	주소 : <input type="text" name="addr"
		value="${param.addr }"><br><br>
	<input type="submit" value="전송">
</form>

<h2>파라미터 값</h2>
<p>userid - ${param.userid }</p>
<p>address - ${param['addr'] }</p>

</body>
</html>









