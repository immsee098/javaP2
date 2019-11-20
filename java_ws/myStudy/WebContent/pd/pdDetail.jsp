<%@page import="java.text.DecimalFormat"%>
<%@page import="com.myStudy.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.myStudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//pdList.jsp에서 상품명을 클릭하면 get방식으로 이동
	//=>번호에 해당하는 상품명 조회해서 출력
	//=> http://localhost:9090/mystudy/pd/pdDetail.jsp?no=20
	
	//get
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
	DecimalFormat df = new DecimalFormat("#,###");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdDetail.jsp</title>
<script type="text/javascript">
	function del(no){
		if(confirm("삭제하시겠습니까?")){
			location.href="pdDelete.jsp?no="+no;
		}
	}
	
	
	function del2(){
		if(confirm("삭제하시겠습니까?")){
			location.href="pdDelete.jsp?no=<%=no %>";
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
	<a href="pdList.jsp">목록</a> | 
	<a href="pdEdit.jsp?no=<%=no %>">수정</a> | 
	<a href="#" onclick="del(<%=no %>)">삭제</a>
	<a href="#" onclick="del2()">삭제</a>
	 
</body>
</html>



