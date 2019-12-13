<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
	//request에 저장된 결과 읽어오기
	//PdDTO dto=(PdDTO)request.getAttribute("pdDto");

%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>pdEdit.jsp</title>
</head>
<body>
	<h1>상품 수정</h1>
	<form name="frmEdit" method="post" 
		action="<c:url value='/pd/pdEdit_ok.do'/>">
		<!-- 수정시 no가 필요하므로 hidden필드에 넣어서 처리 -->
		<input type="hidden" name="no" 
			value="${pdDto.no}">
			
		상품명 : <input type="text" name="pdName" 
			value="${pdDto.pdName}"><br>
		가격 : <input type="text" name="price" value="${pdDto.price}">
			<br><br>
		<input type="submit" value="수정">
		<input type="reset" value="취소">
	</form>
	
	<br>
	<a href="<c:url value='/pd/pdList.do'/>">
		상품목록으로</a>
</body>
</html>


