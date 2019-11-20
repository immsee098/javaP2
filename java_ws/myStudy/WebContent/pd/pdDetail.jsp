<%@page import="java.text.DecimalFormat"%>
<%@page import="com.myStudy.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.myStudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//pdList.jsp���� ��ǰ���� Ŭ���ϸ� get������� �̵�
	//=>��ȣ�� �ش��ϴ� ��ǰ�� ��ȸ�ؼ� ���
	//=> http://localhost:9090/mystudy/pd/pdDetail.jsp?no=20
	
	//get
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
	DecimalFormat df = new DecimalFormat("#,###");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdDetail.jsp</title>
<script type="text/javascript">
	function del(no){
		if(confirm("�����Ͻðڽ��ϱ�?")){
			location.href="pdDelete.jsp?no="+no;
		}
	}
	
	
	function del2(){
		if(confirm("�����Ͻðڽ��ϱ�?")){
			location.href="pdDelete.jsp?no=<%=no %>";
		}
	}
</script>
</head>
<body>
	<h1>��ǰ �󼼺���</h1>
	<p><%=no %>�� Ŭ���߽��ϴ�.</p>
	<br>
	<p>��ȣ : <%=no %></p>
	<p>��ǰ�� : <%=dto.getPdName() %></p>
	<p>���� : <%=df.format(dto.getPrice()) %>��</p>
	<p>����� : <%=dto.getRegdate() %></p>
	<br>
	<a href="pdList.jsp">���</a> | 
	<a href="pdEdit.jsp?no=<%=no %>">����</a> | 
	<a href="#" onclick="del(<%=no %>)">����</a>
	<a href="#" onclick="del2()">����</a>
	 
</body>
</html>



