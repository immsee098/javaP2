<%@page import="com.mymvc.pd.model.PdDTO"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//request에 저장한 결과 읽어오기
	List<PdDTO> list=(List<PdDTO>)request.getAttribute("list");

	//3. 결과 처리
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DecimalFormat df = new DecimalFormat("#,###");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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
					<td><a href
="<%=request.getContextPath() %>/pd/pdDetail.do?no=<%=dto.getNo() %>">
						<%=dto.getPdName() %></a></td>
					<td style="text-align: right">
						<%=df.format(dto.getPrice()) %>원</td>
					<td><%=sdf.format(dto.getRegdate()) %></td>
				</tr>
		<%	} %>
		<!-- 반복 끝 -->
	</table>
	
	<bR>
	<a href="<%=request.getContextPath() %>/pd/pdWrite.do">
		상품 등록으로</a>
	
</body>
</html>






