<%@page contentType="text/html;charset=euc-kr" %>

<%!
	//����� - ��������� �޼��带 �����ϴ� �κ�
	String id;

	public int add(int a, int b){
		return a+b;
	}
%>

<%
	//��ũ��Ʈ�� - jsp�ڵ带 �ִ� �κ�
	//���⿡�� ������ ������ ��� ����������
	int num=10;
	
	int result=add(20,30);

	out.println("������� id="+id+"<br>");
	out.println("�������� num="+num+"<br>");
	out.print("<p>�μ��� ��:"+ result+"</p>");

	id="hong";
%>
<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>
 <BODY>
  <h1>����� ������� id : <%=id%></h1>

 </BODY>
</HTML>
