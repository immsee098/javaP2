<%@page contentType="text/html;charset=euc-kr"%>
<%@page import = "java.util.Date" %>
<!-- page directive(������ ������): �������� ���� ���� ����-->

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> now1.jsp </TITLE>  
  <script >
   
  </script>
 </HEAD>

 <BODY>
<%
	//��ũ��Ʈ�� - jsp�ڵ带 �ִ� ��
	Date d = new Date();
	String str= d.toLocaleString();
	out.println("<h1>���� ��¥ : "+ str +"</h1>"); 
	/* out=> jsp ���尴ü 
	   - �������� ����϶�� ��*/
%>
  
  <h2>jsp ����</h2>
  <p>���� ��¥�� <%=str%> �Դϴ�.</p>
  <!-- ǥ���� : out.println()�� ���� -->

<!-- http://localhost:9090/testsite/now1.jsp 
-->


 </BODY>
</HTML>
