
<%@page import="com.model.reservation.petInfoVO"%>
<%@page import="com.model.reservation.petInfoDAO"%>
<%@page import="com.model.mypage.sitterDAO"%>
<%@page import="com.model.mypage.memberVO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.model.reservation.resvDAO"%>
<%@page import="com.model.reservation.resContentVO"%>
<%@page import="com.model.reservation.resPlanVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	request.setCharacterEncoding("utf-8");

	int memno=263;
	int s_no=memno+100;
	
	resvDAO reDao = new resvDAO();

	List<resPlanVO> planList = new ArrayList<resPlanVO>();
	List<resContentVO> contentList = null;
	
	
	try{
		contentList = reDao.getResNo(s_no);
		
	} catch(SQLException e){
		e.printStackTrace();
	}
	
	Iterator<resContentVO> it = contentList.iterator();
	
	while(it.hasNext()){
		int resno = it.next().getResNo();
		//System.out.println("resno ="+ resno);
		
		try{
			resPlanVO vo = reDao.selectAllPlan(resno);
			//reDao.selectAllPlan(resno)
			planList.add(vo);
			//System.out.println(vo.getRes_edate());
			
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	//System.out.println("사이즈 측정"+planList.size());
	Iterator<resPlanVO> it2 = planList.iterator();
	
	while(it2.hasNext()){
		int rescalno = it2.next().getResCalNo();
		//System.out.println("recalno ="+ rescalno);
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세부확인</title>

<style type="text/css">
	.fi-list {
		background: #333;
	}

	.fi-list div{
		color:white;
		font-weight: 700;
	}
	
	.si-rev-list {
		border: 1px solid #333;
		margin: 5px 0 5px 0;
		border-radius: 5px;
		padding: 5px;
	}
	
	.si-rev-list div {
		padding: 4px;
	}
	
	.hide-btn{
		background: #333;
	}
	
	#resList-title {
        width: 40%;
        font-weight: 800;
    	text-align: center;
   		margin: 0 auto;
   		padding: 20px 0 30px 0;
    }
</style>
</head>
<%@ include file="../../inc/navTop.jsp" %>
<div id=center-view>
	<%@ include file="../../inc/sideMenu.jsp" %>
	<section id=main-content>
	<h1 id="resList-title">예약 확인 : 시터용</h1>
		<ul class="si-rev">
		<li class="si-rev-list fi-list" style="margin-bottom: 20px">
			<div class="rev-15">예약 시작 일자</div><!-- 예약들어간일자 -->
			<div class="rev-12">체크인 시간</div><!-- 예약 시간 -->
			<div class="rev-12">체크아웃 시간</div><!-- 예약 시간 -->
			<div class="rev-9">맡긴 분</div><!-- 예약자명 -->
			<div class="rev-9">동물이름</div><!-- 동물 종류 -->
			<button class="rev-btn hide-btn" disabled="disabled">-----</button>	
		</li>
		
		<%
		for(int i=0; i<planList.size(); i++){
			resPlanVO repl = planList.get(i);
			int rsNo = repl.getResno();
			System.out.println("예약번호"+repl.getResno());	
			
			SimpleDateFormat sdf3 = new SimpleDateFormat("MM월 dd일");
			String day = sdf3.format(repl.getRes_sdate())+"~"+sdf3.format(repl.getRes_edate());
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("HH시");
			String chIn = sdf4.format(repl.getRes_stime());
			String chOut = sdf4.format(repl.getRes_etime());
			
			
			sitterDAO siDao = new sitterDAO();
			int memNN = contentList.get(i).getMemno();
			memberVO memvo = siDao.selectByNo(memNN);
			//System.out.println("회원 이름"+memvo.getMemName());
			String memname = memvo.getMemName(); 
			
			int petNN = contentList.get(i).getPetno();
			petInfoDAO petinfoDao = new petInfoDAO();
			petInfoVO petinfoVo = petinfoDao.selectByPetNo(petNN);
			String petname = petinfoVo.getPetname();
			
			char conChk = contentList.get(i).getConfirm();
			
			if(conChk == '0'){
			
			 
		%>	
		<li class="si-rev-list">
			<div class="rev-15"><%=day %></div><!-- 예약들어간일자 -->
			<div class="rev-12"><%=chIn %></div><!-- 예약 시간 -->
			<div class="rev-12"><%=chOut %></div><!-- 예약 시간 -->
			<div class="rev-9"><%=memname %></div><!-- 예약자명 -->
			<div class="rev-9 selBdNo"><%=petname %></div><!-- 동물 종류 -->
			<button id=<%=rsNo %> class="rev-btn">예약 취소</button>	
		</li>
		
		<%
			} else {
		%>
		<li class="si-rev-list con-out">
			<div class="rev-15"><%=day %></div><!-- 예약들어간일자 -->
			<div class="rev-12"><%=chIn %></div><!-- 예약 시간 -->
			<div class="rev-12"><%=chOut %></div><!-- 예약 시간 -->
			<div class="rev-9"><%=memname %></div><!-- 예약자명 -->
			<div class="rev-9 selBdNo"><%=petname %> </div><!-- 동물 종류 -->
			<button disabled="disabled" class="rev-btn" id=<%=rsNo %>>취소 완료</button>	
		</li>
		
		<%
			}//ifelse 끝나는 곳
			memvo = null;
			
		}	
		
		contentList = null;
		planList = null;
		%>
	</ul>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("button").on("click", function(e) {
				var idName = $(this).attr("id");
				location.href = "sitterResv_cancel.jsp?no="+idName;
				console.log(idName);
			})
		})
	</script>
	
	</section>
</div>
<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
    