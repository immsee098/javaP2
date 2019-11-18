<%@page contentType="text/html; charset=euc-kr" %> 
<%@page import="java.util.Date" %> 



<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> now1.jsp </TITLE>
 </HEAD>

 <BODY>
  <%
		Date d = new Date(); 
		String str = d.toLocaleString(); 
		out.println("<h1>오늘 날짜 : "+str+"</h1>");
  %>

  <h2>jsp연습</h2>
  <p>현재 날짜는 <%=str%>입니다.</p>
 </BODY>
</HTML>
