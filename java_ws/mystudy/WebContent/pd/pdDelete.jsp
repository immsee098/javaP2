<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdDelete.jsp</title>
</head>
<body>
<%
	//pdDetail.jsp���� [����]��ũ Ŭ���ϸ� get������� �̵�
	//=> �Ķ���͸� �о pd���̺��� ����ó��
		
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
	PdDAO dao = new PdDAO();	
	try{
		int cnt=dao.deletePd(Integer.parseInt(no));
		
		if(cnt>0){
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("��ǰ ���� ����");
		}		
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
%>
</body>
</html>
