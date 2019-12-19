<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.model.mypage.sDiaryDAO"%>
<%@page import="com.model.mypage.sDiaryVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	request.setCharacterEncoding("utf-8");

	String no = request.getParameter("no");
	
	sDiaryVO sdVo = new sDiaryVO();
	sDiaryDAO sdDao = new sDiaryDAO();
	
	sdVo = sdDao.selectOneDi(Integer.parseInt(no));
	
	SimpleDateFormat sdfDi = new SimpleDateFormat("yyyy년 MM월 dd일");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세부확인</title>

<style>
	#di-box {
		text-align: center;
	}
	#dates, #pets, #photos, #content {
		width: 80%;
		font-weight: 700;	
		padding: 10px 0 10px 0;
		margin: 0 auto;
		border-radius: 5px;
	}
	
	#dates {
		background: #333;
		color: white;
		margin-top: 20px;
	}
	
	#content {
		margin-top: 20px;
		margin-bottom: 30px;
		border: 2px solid #333;
		border-radius: 5px;
		word-break: keep-all;
	}
	
	#di-box a {
		border: 1px solid #333;
		border-radius: 5px;
		text-decoration: none;
		color: #333;
		padding: 4px;
		margin-bottom: 50px;
	}
</style>

</head>
<%@ include file="../../inc/navTop.jsp" %>
<div id=center-view>
	<%@ include file="../../inc/sideMenu.jsp" %>
	<section id=main-content>
	
	<div id="di-box">
		<div id = "dates">날짜 : <%=sdfDi.format(sdVo.getD_date()) %></div>
		<div id= "pets">반려동물 : <%=sdVo.getPetName() %></div>
		<div id = "photos"><img src="<%=sdVo.getD_photo()%>"></div>
		<div id = "content">[ 반려 동물 일지 ]<br><br><%=sdVo.getD_content() %></div>
		
		<a href="sitterDiaryList.jsp">뒤로가기</button>	
	</div>
	
	</section>
</div>
<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
    