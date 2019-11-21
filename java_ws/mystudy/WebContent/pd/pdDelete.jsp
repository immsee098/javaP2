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
	//pdDetail.jsp에서 [삭제]링크 클릭하면 get방식으로 이동
	//=> 파라미터를 읽어서 pd테이블에서 삭제처리
		
	//1.
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){ %>
		<script type="text/javascript">
			alert("잘못된 url입니다.");
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
			System.out.println("상품 삭제 실패");
		}		
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
%>
</body>
</html>
