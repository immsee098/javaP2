<%@page import="java.sql.SQLException"%>
<%@page import="com.myStudy.pd.model.PdDTO"%>
<%@page import="com.myStudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%

	request.setCharacterEncoding("euc-kr");

	String no = request.getParameter("no");
	
	PdDAO dao = new PdDAO();
	PdDTO dto = new PdDTO();
	dto.setNo(Integer.parseInt(no));
	
	try{
		int cnt = dao.deletePd(dto.getNo());
		if(cnt>0){
			response.sendRedirect("pdList.jsp");
		} else {
			System.out.println("상품 삭제 실패");
		}
	} catch (SQLException e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>