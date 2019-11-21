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
	//pdWrite.jsp에서 post방식으로 submit됨
	//=> 사용자입력값을 읽어와서 pd테이블에 insert
	
	//post
	//요청 파라미터에 대한 한글 인코딩 처리
	request.setCharacterEncoding("euc-kr");
	
	//1. 요청 파라미터 읽어오기
	String pdname=request.getParameter("pdName");
	String price=request.getParameter("price");
	
	//2. db작업
	PdDAO dao = new PdDAO();
	PdDTO pdDto = new PdDTO();
	pdDto.setPdName(pdname);
	pdDto.setPrice(Integer.parseInt(price));
	
	try{
		int cnt=dao.insertPd(pdDto);
		
		//3. 결과처리
		if(cnt>0){
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("상품 등록 실패!");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
%>
</body>
</html>



