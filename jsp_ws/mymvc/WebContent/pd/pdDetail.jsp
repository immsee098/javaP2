<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
	//request에 저장된 결과 읽어오기
	//PdDTO dto=(PdDTO)request.getAttribute("pdDto");
	
	//DetailController에서 no 파라미터를 읽을 수 있듯이
	//pdDetail.jsp로 포워드 되므로 jsp에서도 파라미터를 읽어올 수 있다
	//String no=request.getParameter("no");
	
	//3.
	//DecimalFormat df = new DecimalFormat("#,###");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>pdDetail.jsp</title>
<script type="text/javascript">
	function del(no){
		if(confirm("삭제하시겠습니까?")){
			location.href
				="<c:url value='/pd/pdDelete.do?no="+no+"'/>";
		}
	}
	
	function del2(){
		if(confirm("삭제하시겠습니까?")){
			location.href
			="<c:url value='/pd/pdDelete.do?no=${param.no}'/>";
		}		
	}
	
</script>
</head>
<body>
	<h1>상품 상세보기</h1>
	<p>${param.no}를 클릭했습니다.</p>
	<br>
	<p>번호 : ${param.no}</p>
	<p>상품명 : ${pdDto.pdName}</p>
	<p>가격 : <fmt:formatNumber value="${pdDto.price }" pattern="#,###" /> 
	원</p>
	<p>등록일 : ${pdDto.regdate}</p>
	<br>
	<a href="<c:url value='/pd/pdList.do'/>">목록</a> | 
	<a href="<c:url value='/pd/pdEdit.do?no=${param.no }'/>">
	수정</a> | 
	<a href="#" onclick="del(${param.no})">삭제</a> |
	<a href="#" onclick="del2()">삭제</a>
	 
</body>
</html>








