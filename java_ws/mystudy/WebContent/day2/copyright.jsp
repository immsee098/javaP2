<%@page contentType="text/html;charset=euc-kr" %>
<%@page import="java.util.Date" %>

<hr>
<%
	Date d = new Date();
	String str=d.toLocaleString();
%>
<h3>현재일자는 <%=str%>입니다.</h3>
<p>copyright &copy; testsite.com </p>

<!-- http://localhost:9090/testsite/day2/copyright.jsp-->






