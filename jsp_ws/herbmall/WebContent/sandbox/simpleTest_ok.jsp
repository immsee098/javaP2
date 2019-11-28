<%@page import="com.herbmall.test.SimpleVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>simpleTest_ok.jsp</title>
</head>
<body>
	<%
		//기존 방식
		/* //1
		request.setCharacterEncoding("utf-8");
		String userid=request.getParameter("userid");
		String name=request.getParameter("name");
		String no=request.getParameter("no");
		
		//2
		SimpleVO simVo = new SimpleVO();
		simVo.setUserid(userid);
		simVo.setNo(Integer.parseInt(no));
		simVo.setName(name); */
		
		//3
	%>
	<%-- <h1>기존 방식</h1>
	<p>userid : <%=simVo.getUserid() %></p>
	<p>name : <%=simVo.getName() %></p>
	<p>no : <%=simVo.getNo() %></p> --%>
	
	
	<%
		request.setCharacterEncoding("utf-8");	
	%>
	<jsp:useBean id="vo" class="com.herbmall.test.SimpleVO" 
		scope="page"></jsp:useBean>
	<jsp:setProperty property="userid" name="vo"/>
	<jsp:setProperty property="name" name="vo"/>
	<jsp:setProperty property="no" name="vo"/>
	
	<h1>액션 태그 이용</h1>
	
	<p>아이디: <jsp:getProperty property="userid" name="vo"/></p>
	<p>이름: <jsp:getProperty property="name" name="vo"/></p>
	<p>번호: <jsp:getProperty property="no" name="vo"/></p>
	
</body>
</html>








