<%@page import="com.model.mypage.sitterDAO"%>
<%@page import="com.model.reservation.petInfoVO"%>
<%@page import="com.model.reservation.petInfoDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.model.reservation.resContentVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.reservation.resvDAO"%>
<%@page import="com.model.mypage.sDiaryDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	request.setCharacterEncoding("utf-8");
	//int memno = (int)session.getAttribute("memno");
	//세션의 경우 로그인과 합쳤을 시 다시 추가하겠습니다. 현재는  전부 임의로 memno에 값을 넣었습니다
	int memno=263;
	int s_no=memno+100;
	
	sDiaryDAO sdiDao = new sDiaryDAO();
	
	resvDAO resDao = new resvDAO();
	
	List<resContentVO> resList = new ArrayList<resContentVO>();
	
	resList = resDao.getResNo(s_no);
	
	//System.out.println(resList.size());
	petInfoDAO petinfoDao = new petInfoDAO();
	sitterDAO sitterDao = new sitterDAO();
	petInfoVO petinVo = null;
	//Iterator<resContentVO> iter = resList.iterator();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세부확인</title>

<style type="text/css">
	#siWrite-title {
        width: 40%;
        font-weight: 800;
    	text-align: center;
   		margin: 0 auto;
   		padding-top: 20px;
    }
</style>
</head>
<%@ include file="../../inc/navTop.jsp" %>
<div id=center-view>
	<%@ include file="../../inc/sideMenu.jsp" %>
	<section id=main-content>
	<h1 id="siWrite-title">세부 일지</h1>
	
	<div>
		<form name="sitWrite" method="post" action="sitterWrite_ok.jsp">
			<input type="text" name="petno" id="petNo" style="display:none"><br>
			<input type="text" name="memno" id="memNo" style="display:none"><br>
			받는 사람 <input type="text" name="memberName" id="memberName"><br>
			동물 이름 
			<select name="pets" id="petname">
		
			<%
				for(int i=0; i<resList.size(); i++){
					int petno = resList.get(i).getPetno();
					System.out.println(petno);
					petinVo = petinfoDao.selectByPetNo(petno);
					String petname = petinVo.getPetname();
					int pMemNo = petinVo.getMemno();
					String memName = sitterDao.selectByNo(pMemNo).getMemName();
					
			%>
				
				<option id="<%=pMemNo %>" value="<%=petno %>" class="<%=memName%>"><%=petname %></option>
			<%	
			}
			
			%>
			</select><br>
			내용 <br><input type="text" name="content"><br>
			사진 <br><input type="file" name="filename"><br>
			<input type="submit">
		</form>
	</div>
	
	</section>
</div>
<%@ include file="../../inc/footer.jsp" %>

<script>
	$(document).ready(function() {
		$("#petname").change(function() {
			console.log($("select[name=pets] option:selected").text());
			$("#memNo").val($("#petname option:selected").attr("id"));
			$("#petNo").val($("#petname option:selected").val());
			$("#memberName").val($("#petname option:selected").attr("class"));
		})
	})
</script>
</body>
</html>
    