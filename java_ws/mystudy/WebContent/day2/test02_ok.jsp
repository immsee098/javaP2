<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
  <%
	//post������� ����
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");

	//��û �Ķ���� �о����
	String name=request.getParameter("name");
	String addr=request.getParameter("address");
	String agree=request.getParameter("agree");
	
	//���� ������ ���
	String[] petArr=request.getParameterValues("pet");

	String pets="";
	if(petArr!=null){
		for(int i=0;i<petArr.length;i++){
			pets +=petArr[i]+" ";
		}
	}
  %>

  <h1>����� �Է°� - ��û �Ķ������ ����</h1>
  <p>�̸� : <%=name%></p>
  <p>�ּ� : <%=addr%></p>
  <p>���ǿ��� : <%=agree%></p>
  <p>�����ϴ� ���� : <%=pets%></p>

 </BODY>
</HTML>
