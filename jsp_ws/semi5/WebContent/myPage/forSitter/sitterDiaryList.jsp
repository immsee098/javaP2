<%@page import="java.sql.Date"%>
<%@page import="com.model.mypage.sitterDAO"%>
<%@page import="com.model.mypage.memberVO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.model.mypage.sDiaryVO"%>
<%@page import="java.util.List"%>
<%@page import="com.model.mypage.sDiaryDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	request.setCharacterEncoding("utf-8");

	//int memno = (int)session.getAttribute("memno");
	//세션의 경우 로그인과 합쳤을 시 다시 추가하겠습니다. 현재는  전부 임의로 memno에 값을 넣었습니다
	int memno=163;
	int s_no=memno+100;
	
	sDiaryDAO diDao = new sDiaryDAO();
	
	//memberVO mvo = new memberVO();
	//sitterDAO sdao = new sitterDAO();
	//mvo = sdao.selectByNo(memno);
	//System.out.println(mvo.getMemName());
	
	List<sDiaryVO> list = null;
	
	try{
		list = diDao.selectAllS(s_no);
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아워시터</title>
<style type="text/css">

	#diaryL-title {
        width: 40%;
        font-weight: 800;
    	text-align: center;
   		margin: 0 auto;
   		padding: 20px 0 30px 0;
    }

	.d-list{
		border: 1px solid black;
		border-collapse: collapse;
		justify-content: space-around;
		padding: 7px;
		margin-bottom: 5px;
		text-align: center;
		border-radius: 5px;
	}
	
	.back-gray{
		background: #333;
		color: white;
	}
	
	a:link {
		text-decoration: none;
	}
</style>

</head>
<%@ include file="../../inc/navTop.jsp" %>
<div id=center-view>
	<%@ include file="../../inc/sideMenu.jsp" %>
	<section id=main-content>
	<h1 id="diaryL-title">내가 쓴 일지</h1>
	
	<ul>
		<li class="d-list back-gray" style="display:flex; list-style-type: none; font-weight: 700">
			<div class="d-no">No</div>
			<div class="d-title">제목</div>
			<div class="d-mem">받는 분</div>
			<div class="d-pet">애완견/묘 이름</div>
		</li>
		<%
		for(int i=0; i<list.size(); i++){
			sDiaryVO diLi = list.get(i);
			//System.out.println(diLi.getD_photo());	
			int Mno = diLi.getMemNo();
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
			
			
			memberVO mvo = new memberVO();
			sitterDAO siDao = new sitterDAO();
			mvo = siDao.selectByNo(Mno);
			
			System.out.println("이름="+mvo.getMemName());
			String meName = mvo.getMemName();
			
			if(i%2==0){%>
				<li class="d-list" style="display:flex; list-style-type: none">
					<div class="d-no"><%=diLi.getD_No()%></div>
					<div class="d-title"><a href="sitterDiaryDetail.jsp?no=<%=diLi.getD_No()%>"><%=sdf2.format(diLi.getD_date())%> 일지</a></div>
					<div class="d-mem"><%=meName %></div>
					<div class="d-pet"><%=diLi.getPetName() %></div>
				</li>
				
				
			<%} else {%>
				<li class="d-list back-gray" style="display:flex; list-style-type: none">
					<div class="d-no"><%=diLi.getD_No()%></div>
					<div class="d-title"><a href="sitterDiaryDetail.jsp?no=<%=diLi.getD_No()%>"><%=sdf2.format(diLi.getD_date())%> 일지</a></div>
					<div class="d-mem"><%=meName %></div>
					<div class="d-pet"><%=diLi.getPetName() %></div>
				</li>
				
			<%}
		
		 } %>
	</ul>
	<a href="sitterWrite.jsp">글쓰기</a>
	</section>
</div>
<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
