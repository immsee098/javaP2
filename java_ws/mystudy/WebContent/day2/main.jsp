<%@page contentType="text/html;charset=euc-kr" %>
<%@page import="java.util.Date" %>
<%
	Date today = new Date();
	String s = today.toLocaleString();
%>
<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> day2/main.jsp </TITLE>
 </HEAD>
 <BODY>
  <h1>main ������</h1>
  <p>���� ��¥ : <%=s%></p>	
  <h2>include ������ �̿�</h2>
  <%@include file="copyright.jsp" %>
  <!-- include ������  : Ư�� ������ ���Խ�ų �� ���
			�������� �ҽ��� ���Խ�Ŵ	-->

  <h2>include �׼� �±� �̿�</h2>	
  <jsp:include page="copyright.jsp" />
  <!--include �׼� �±� : �ҽ��� �ƴ� �������� �������� ���Խ�Ŵ -->

 </BODY>
</HTML>
