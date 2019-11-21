<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//pdDetail.jsp���� [����]��ũ Ŭ���ϸ�  get������� �̵�
	//=>��ȣ�� �ش��ϴ� ��ǰ�� ��ȸ�ؼ� ���
	//=> http://localhost:9090/mystudy/pd/pdEdit.jsp?no=20
	
	//1.
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){ %>
		<script type="text/javascript">
			alert("�߸��� url�Դϴ�.");
			location.href="pdList.jsp";
		</script>
		
	<%	return;
	}
	
	//2.
	PdDAO dao=new PdDAO();
	PdDTO dto=null;
	try{
		dto=dao.selectByNo(Integer.parseInt(no));	
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3.
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdEdit.jsp</title>
</head>
<body>
	<h1>��ǰ ����</h1>
	<form name="frmEdit" method="post" action="pdEdit_ok.jsp">
		<!-- ������ no�� �ʿ��ϹǷ� hidden�ʵ忡 �־ ó�� -->
		<input type="hidden" name="no" 
			value="<%=dto.getNo()%>">
			
		��ǰ�� : <input type="text" name="pdName" 
			value="<%=dto.getPdName()%>"><br>
		���� : <input type="text" name="price" value="<%=dto.getPrice()%>">
			<br><br>
		<input type="submit" value="����">
		<input type="reset" value="���">
	</form>
	
	<br>
	<a href="pdList.jsp">��ǰ�������</a>
</body>
</html>