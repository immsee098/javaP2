<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorTest/date2.jsp</title>
</head>
<body>
<h1>date2.jsp 페이지</h1>
<%
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String str=sdf.format(d);
%>
<h2>현재 날짜</h2>
<p><%=st %></p><!-- 고의로 에러 발생시킴 -->
</body>
</html>

<!-- 
	[1] web.xml
	[2] include지시자/액션태그
	[3] forward
	
	=> 절대참조시 컨텍스트 패스가 자동으로 추가됨
	
	http://localhost:9090/herbmall/sandbox/errorTest/404code.jsp
	절대참조 => /herbmall/sandbox/errorTest/404code.jsp
	
	위 3가지 경우 절대참조 => /sandbox/errorTest/404code.jsp
	(자동으로 컨텍스트 패스인 /herbmall 이 추가되므로)
 -->







