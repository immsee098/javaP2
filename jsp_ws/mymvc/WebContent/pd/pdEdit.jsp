<%@page import="com.mymvc.pd.model.PdDTO"%>
<%@page import="com.mymvc.pd.model.PdDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//pdDetail.jsp에서 [수정]링크 클릭하면  get방식으로 이동
	//=>번호에 해당하는 상품명 조회해서 출력
	//=> http://localhost:9090/mystudy/pd/pdEdit.jsp?no=20
	
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
<meta charset="utf-8">
<title>pdEdit.jsp</title>
</head>
<body>
	<h1>상품 수정</h1>
	<form name="frmEdit" method="post" action="pdEdit_ok.jsp">
		<!-- 수정시 no가 필요하므로 hidden필드에 넣어서 처리 -->
		<input type="hidden" name="no" 
			value="<%=dto.getNo()%>">
			
		상품명 : <input type="text" name="pdName" 
			value="<%=dto.getPdName()%>"><br>
		가격 : <input type="text" name="price" value="<%=dto.getPrice()%>">
			<br><br>
		<input type="submit" value="수정">
		<input type="reset" value="취소">
	</form>
	
	<br>
	<a href="<%=request.getContextPath()%>/pd/pdList.do">상품목록으로</a>
</body>
</html>