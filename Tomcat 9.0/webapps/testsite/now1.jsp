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
		out.println("<h1>���� ��¥ : "+str+"</h1>");
  %>

  <h2>jsp����</h2>
  <p>���� ��¥�� <%=str%>�Դϴ�.</p>
 </BODY>
</HTML>
