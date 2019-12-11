<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	//request에 저장한 결과 읽어오기
	//List<PdDTO> alist=(List<PdDTO>)request.getAttribute("list");

	//3. 결과 처리
	//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//DecimalFormat df = new DecimalFormat("#,###");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%-- len: ${fn:length(list)} --%>

	<h1>상품 목록</h1>
	<table border="1" style="width:600px">
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>등록일</th>			
		</tr>
		<!-- 반복 시작 -->
		<c:if test="${empty list }">
			<tr style="text-align: center">
				<td colspan="4">데이터가 존재하지 않습니다.</td>
			</tr>
		</c:if>
		<c:if test="${!empty list }">
			<%-- <c:forEach var="i" begin="0" end="${fn:length(list)-1}">
				<c:set var="vo" value="${list[i] }"></c:set> --%>
			<c:forEach var="vo" items="${list }">	
		<%
			//for(int i=0;i<alist.size();i++){
			//	PdDTO dto=alist.get(i); %>
				<tr>
					<td>${vo.no}</td>
					<td><a href
						="<c:url value='/pd/pdDetail.do?no=${vo.no}'/>">
						${vo.pdName}</a></td>
					<td style="text-align: right">						
						<fmt:formatNumber value="${vo.price }" 
							pattern="#,###"/>원</td>
					<td>
						<fmt:formatDate value="${vo.regdate }" 
							pattern="yyyy-MM-dd"/>		
					</td>
				</tr>
		<%	//} %>
		<!-- 반복 끝 -->
			</c:forEach>
		</c:if>
	</table>
	
	<bR>
	<a href="<c:url value='/pd/pdWrite.do'/>">
		상품 등록으로</a>
	
</body>
</html>






