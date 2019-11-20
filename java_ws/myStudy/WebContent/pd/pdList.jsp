<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.myStudy.pd.model.PdDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.myStudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//[1] pdWrite.jsp���� [��ǰ������� ]��ũ Ŭ���ϸ� get������� �̵�
	//[2] pdWrite_ok.jsp���� ��ǰ��� �����ϸ� get������� �̵�
	//=> ��ǰ��ü ��ȸ�ؼ� ���
	
	//get
	//1. ��û �Ķ���� �о���� 	
	//2. db�۾�
	PdDAO dao = new PdDAO();
	List<PdDTO> list=null;
	try{
		list=dao.selectAll();
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
	//3. ��� ó��
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DecimalFormat df = new DecimalFormat("#,###");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��ǰ ���</h1>
	<table border="1" style="width:600px">
		<tr>
			<th>��ȣ</th>
			<th>��ǰ��</th>
			<th>����</th>
			<th>�����</th>			
		</tr>
		<!-- �ݺ� ���� -->
		<%
			for(int i=0;i<list.size();i++){
				PdDTO dto=list.get(i); %>
				<tr>
					<td><%=dto.getNo() %></td>
					<td><a href="pdDetail.jsp?no=<%=dto.getNo() %>">
						<%=dto.getPdName() %></a></td>
					<td style="text-align: right">
						<%=df.format(dto.getPrice()) %>��</td>
					<td><%=sdf.format(dto.getRegdate()) %></td>
				</tr>
		<%	} %>
		<!-- �ݺ� �� -->
	</table>
	
	<bR>
	<a href="pdWrite.jsp">��ǰ �������</a>
	
</body>
</html>






