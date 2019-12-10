<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sandbox/elTest/elTest1.jsp</title>
</head>
<body>
<%
	//표현언어-EL : 기존의 jsp 표현식을 대체하는 효과
	//el 표현식에는 연산자 사용 가능, 내장객체 지원함
  	//null에 관대하고 형변환도 자동으로 해줌
%>
<h1>el 표현식</h1>
 <p>\${3+5 } =>  ${3+5 }</p>
 <p>\${100/3 } =>  ${100/3 }</p>
 <p>\${100%3 } =>  ${100%3 }</p>
 <p>\${59>=26 } =>  ${59>=26 }</p>
 <p>\${10!=20 } =>  ${10!=20 }</p>
 <p>\${10==20 } =>  ${10==20 }</p>

 <p>\${header.host} =>  ${header.host }</p>
 <p>\${header["user-agent"]} =>  ${header["user-agent"] }</p>
 
 <%
 	//기존 방식
 	String host=request.getHeader("host");
 %>
 <h2>기존 방식</h2>
 <p>host : <%=host %></p>
 <p>user-agent : <%=request.getHeader("user-agent") %></p>
 
</body>
</html>





