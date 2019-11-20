<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.myStudy.pd.model.PdDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.myStudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//[1] pdWrite.jsp에서 [상품목록으로 ]링크 클릭하면 get방식으로 이동
	//[2] pdWrite_ok.jsp에서 상품등록 성공하면 get방식으로 이동
	//=> 상품전체 조회해서 출력
	
	//get
	//1. 요청 파라미터 읽어오기 	
	//2. db작업
	PdDAO dao = new PdDAO();
	List<PdDTO> list=null;
	try{
		list=dao.selectAll();
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
	//3. 결과 처리
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
	<h1>상품 목록</h1>
	<table border="1" style="width:600px">
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>등록일</th>			
		</tr>
		<!-- 반복 시작 -->
		<%
			for(int i=0;i<list.size();i++){
				PdDTO dto=list.get(i); %>
				<tr>
					<td><%=dto.getNo() %></td>
					<td><a href="pdDetail.jsp?no=<%=dto.getNo() %>">
						<%=dto.getPdName() %></a></td>
					<td style="text-align: right">
						<%=df.format(dto.getPrice()) %>원</td>
					<td><%=sdf.format(dto.getRegdate()) %></td>
				</tr>
		<%	} %>
		<!-- 반복 끝 -->
	</table>
	
	<bR>
	<a href="pdWrite.jsp">상품 등록으로</a>
	
</body>
</html>






