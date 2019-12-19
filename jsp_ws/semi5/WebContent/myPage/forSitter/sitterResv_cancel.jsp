<%@page import="com.model.reservation.resvDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아워시터</title>
</head>
<%@ include file="../../inc/navTop.jsp" %>
<%@ include file="../../inc/sideMenu.jsp" %>

<%
	request.setCharacterEncoding("utf-8");

	//int memno = (int)session.getAttribute("memno");
	//세션의 경우 로그인과 합쳤을 시 다시 추가하겠습니다. 현재는  전부 임의로 memno에 값을 넣었습니다
	int memno = 263;
	
	String resno = request.getParameter("no");
	
	resvDAO rsDao = new resvDAO();
	int cnt = rsDao.updateDel(Integer.parseInt(resno));
	
	if(cnt>0){%>
		<script type="text/javascript">
			alert("취소 성공");
			location.href="sitterResv.jsp"
		</script>
	<%} else {%>
			<script type="text/javascript">
			alert("취소 실패");
			history.back();
			</script>
	<% }
	
%>

<h1>예약 취소</h1>
<section id=main-content>
	<p><%=resno %></p>
  
</section>
<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
