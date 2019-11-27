<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Date d = new Date();
	String str=d.toLocaleString();
	
	request.setCharacterEncoding("utf-8");
	String no=request.getParameter("no");
	String addr=request.getParameter("addr");
%>
<hr>
<p>페이지 하단</p>
<p>오늘 날짜는 <%=str %>입니다.</p>
<h3>파라미터</h3>
<p>no = <%=no %></p>
<p>addr = <%=addr %></p>

