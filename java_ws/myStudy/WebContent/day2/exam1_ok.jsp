<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	
	String name = request.getParameter("name");
	String menu = request.getParameter("menu");
	String[] loc1 = request.getParameterValues("loc1");
	String[] sel = request.getParameterValues("what");
	String loc2 = request.getParameter("loca");
	
	String select = "";
	if(sel!=null){
		for(int i =0; i<sel.length;i++){
			select += sel[i]+" ";
		}
	}
%>

	<h1>====사용자가 입력한 값====</h1>
	<p>상호 : <%=name %></p>
	<p>업종 : <%=menu %></p>
	<p>지역 : <%=loc1 %></p>
	<p>위치 : <%=loc2 %></p>
	<p>기타 옵션 : <%=select %></p>
	<p>------------------------------</p>
	<p>데이터베이스에 저장합니다.</p>
</body>
</html>