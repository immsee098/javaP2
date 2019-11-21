<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdWrite_ok.jsp</title>
</head>
<body>
<%
	//pdWrite.jsp���� post������� submit��
	//=> ������Է°��� �о�ͼ� pd���̺� insert
	
	//post
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");
	
	//1. ��û �Ķ���� �о����
	String pdname=request.getParameter("pdName");
	String price=request.getParameter("price");
	
	//2. db�۾�
	PdDAO dao = new PdDAO();
	PdDTO pdDto = new PdDTO();
	pdDto.setPdName(pdname);
	pdDto.setPrice(Integer.parseInt(price));
	
	try{
		int cnt=dao.insertPd(pdDto);
		
		//3. ���ó��
		if(cnt>0){
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("��ǰ ��� ����!");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
%>
</body>
</html>



