<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
  <%
//=> http://172.16.146.1:9090/samplesite/day2/test03.jsp?no=5&name=ȫ�浿

	//get������� ����

	//��û �Ķ���� �о����
	String no=request.getParameter("no");
	String name=request.getParameter("name");
  %>
  <h1>get������� ���۵� ��û �Ķ���� ��</h1>
  <p>��ȣ : <%=no%></p>
  <p>�̸� : <%=name%></p>

 </BODY>
</HTML>
