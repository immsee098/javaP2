<%@page import="com.mymvc.pd.model.PdDTO"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//request에 저장된 결과 읽어오기
	PdDTO dto=(PdDTO)request.getAttribute("pdDto");
	
	//DetailController에서 no 파라미터를 읽을 수 있듯이
	//pdDetail.jsp로 포워드 되므로 jsp에서도 파라미터를 읽어올 수 있다
	String no=request.getParameter("no");
	
	//3.
	DecimalFormat df = new DecimalFormat("#,###");
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
				="<%=request.getContextPath()%>/pd/pdDelete.do?no="+no;
		}
	}
	
	function del2(){
		if(confirm("삭제하시겠습니까?")){
			location.href
			="<%=request.getContextPath()%>/pd/pdDelete.do?no=<%=no%>";
		}		
	}
	
</script>
</head>
<body>
	<h1>상품 상세보기</h1>
	<p><%=no %>를 클릭했습니다.</p>
	<br>
	<p>번호 : <%=no %></p>
	<p>상품명 : <%=dto.getPdName() %></p>
	<p>가격 : <%=df.format(dto.getPrice()) %>원</p>
	<p>등록일 : <%=dto.getRegdate() %></p>
	<br>
	<a href="<%=request.getContextPath() %>/pd/pdList.do">목록</a> | 
	<a href="<%=request.getContextPath() %>/pd/pdEdit.do?no=<%=no %>">
	수정</a> | 
	<a href="#" onclick="del(<%=no %>)">삭제</a> |
	<a href="#" onclick="del2()">삭제</a>
	 
</body>
</html>








