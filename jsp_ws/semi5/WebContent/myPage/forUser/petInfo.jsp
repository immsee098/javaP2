<%@page import="com.model.mypage.MemberService"%>
<%@page import="com.model.mypage.MemberVO"%>
<%@page import="com.model.pet.petInfoVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.model.pet.petInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%	
	MemberService service=new MemberService();

	MemberVO vo=null;
	String userid=(String)session.getAttribute("userid");
	
	try{
		vo=service.selectMember(userid);
	}catch(SQLException e){
		e.printStackTrace();
	}
	int memNo=vo.getMemNo();
	System.out.println(memNo);
	
	//post
	request.setCharacterEncoding("utf-8");
	
	String condition=request.getParameter("searchCondition");
	String keyword=request.getParameter("searchKeyword");

	//2
	petInfoDAO dao=new petInfoDAO();
	
	List<petInfoVO> list=null;
	try{
		list=dao.selectAll(memNo);
	}catch(SQLException e){
		e.printStackTrace();
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아워시터</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link id="theme-style" rel="stylesheet" href="../../css/theme-1.css">
</head>
<%@ include file="../../inc/navTop.jsp" %>
<div id=center-view>
	<%@ include file="../../inc/sideMenu.jsp" %>
	<section id=main-content>

<div class="container">
			    <div class="item mb-5">
			    <hr style="color:gray">
				    <div class="media">
				    
	<%if(list==null || list.isEmpty()){ %>

	  	  		반려동물을 등록해 주세요

	  <%}else{ %>
	  
	  <!--게시판 내용 반복문 시작  -->	
		  <%
		  for(int i=0;i<list.size();i++){  
				petInfoVO petInfoVo=list.get(i);
		  %>
			<div class="col-xs-7">	    
			<img width="100px" height="100px" class="rounded-circle float-left" src="<%=request.getContextPath() %>/img/<%=petInfoVo.getPetPhoto() %>" alt="image of dog">
			</div>
			<div class="media-body">
			<input type="hidden" id="petNo" name="petNo" value="<%=petInfoVo.getPetNo() %>">
				<h3 class="title mb-1"><%=petInfoVo.getPetName() %></h3>
					<div class="meta mb-1"><span class="date">
					<%
					int type=petInfoVo.getPetType();
					
					if(type==0){
						%>개<%
					}else{
						%>고양이<%
					}
					%>
					</span><span class="time"><%=petInfoVo.getPetAge() %></span>
					<span class="comment">
					<%
					int gender=petInfoVo.getPetGender();
					
					if(gender==0){
						%>수컷<%
					}else{
						%>암컷<%
					}
					%>
					</span>
					</div>
						<div class="intro"><%=petInfoVo.getPetEtc() %></div>
						    <a class="more-link" href="petEdit.jsp?petNo=<%=petInfoVo.getPetNo() %>">수정하기</a> / <a class="more-link" href="petDelete.jsp">삭제하기</a>
					    </div><!--//media-body-->
				    </div><!--//media-->
			   <hr style="color:gray">

	<%}//for %>	
	<!--반복처리 끝  -->
		<%}//if %>
					   
			    </div><!--//item-->
			    <a href="petInsert.jsp">추가하기</a>
		</div>			    
	</section>
	</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
