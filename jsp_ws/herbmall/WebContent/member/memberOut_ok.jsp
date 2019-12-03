<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.member.model.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberOut_ok.jsp</title>
</head>
<body>
<%@ include file="../login/loginCheck.jsp" %>
<%
	//post
	request.setCharacterEncoding("utf-8");	

	//1		
	String userid=(String)session.getAttribute("userid");	
	String pwd=request.getParameter("pwd");
	
	
	MemberService service = new MemberService();
	
	String msg ="회원 탈퇴 실패", url="/login/login.jsp";
	
	try{
		
		int result = service.withdrawMember(userid);
		
		session.invalidate();
		
		msg="회원 탈퇴 성공";
		url="../index.jsp";
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
	
		
%>
</body>
</html>