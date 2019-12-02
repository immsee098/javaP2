<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookieTest/makeCookie.jsp</title>
</head>
<body>
<h1>쿠키 생성</h1>
<%
	//첫번째 쿠키
	Cookie ck1 = new Cookie("id","hong");
	ck1.setMaxAge(2*60);  //쿠키 유효기간 : 120초	
	response.addCookie(ck1);
	
	//두번째 쿠키
	Cookie ck2 = new Cookie("age","20");
	ck2.setMaxAge(20*60);  //쿠키 유효기간 : 20분
	ck2.setPath("/");//경로 설정 : 설정한 경로 및 그 하위 경로에 대해서 쿠키 전달
	response.addCookie(ck2);
%>
	<p>쿠키가 생성되었습니다.</p>
	<a href="useCookie.jsp">useCookie.jsp로 이동</a>
	
</body>
</html>








