<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//pdEdit.jsp에서 수정버튼 클릭하면 post방식으로 submit
	//=> 파라미터를 읽어서 pd테이블에 수정처리
	
	//post
	//한글 인코딩
	request.setCharacterEncoding("utf-8");
	
	//1.
	String no=request.getParameter("no");
	String pdName=request.getParameter("pdName");
	String price=request.getParameter("price");
	
	//2.
	PdDAO dao = new PdDAO();
	PdDTO dto = new PdDTO();
	dto.setNo(Integer.parseInt(no));
	dto.setPrice(Integer.parseInt(price));
	dto.setPdName(pdName);
	
	try{
		int cnt=dao.updatePd(dto);
		
		if(cnt>0){
			response.sendRedirect("pdDetail.jsp?no="+no);
		}else{
			System.out.println("상품 수정 실패");
		}		
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
	//3.

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>pdEdit_ok.jsp</title>
</head>
<body>

</body>
</html>