<%@page import="java.sql.Timestamp"%>
<%@page import="com.model.reservation.resPossibleDAO"%>
<%@page import="com.model.reservation.resPossibleVO"%>
<%@page import="com.model.sitterPre.sBoardVO"%>
<%@page import="com.model.sitterPre.sBoardWriteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아워시터</title>

<style type="text/css">
	.show-none{
		display: none;
	}
	
	#siInfo-title {
        width: 40%;
        font-weight: 800;
    	text-align: center;
   		margin: 0 auto;
   		padding-top: 20px;
    }
    
    .inner-box{
    	width: 80%;
    	margin: 0 auto;
    }
    
    label {
    	width: 17%;
    }
    
    input{
    	width: 80%;
    	height: 30px;
    }
    
    .in-btn {
    	margin: 0 auto;
    	width: 50px;
    	background: white;
    	border: 1px solid #333;
    }
    
    
</style>

</head>
<%
	//나중에 보드 넘버가 있으면 update 없으면 insert 하는걸로 
	//내용물도 동일 넘버가 있으면 내용 채우고 아니면 빈 String에 넣기
	
	//int memno = (int)session.getAttribute("memno");
	//세션의 경우 로그인과 합쳤을 시 다시 추가하겠습니다. 현재는  전부 임의로 memno에 값을 넣었습니다
	int memno = 263;

	sBoardWriteDAO sbwDao = new sBoardWriteDAO();
	sBoardVO sbVo = new sBoardVO();
	resPossibleVO rsVo = new resPossibleVO();
	resPossibleDAO rsDao = new resPossibleDAO();
	
	sbVo = sbwDao.selectByNo(memno);
	//System.out.println(sbVo.getBoardno());
	int boardno = 0;
	String boardtitle = "";
	String photo = "";
	String area = "";
	String address = "";
	int aniSel = 6;
	int price = 0;
	String boardEtc = "";
	String std ="2019-01-01";
	String edd ="2019-01-01";
	String stt ="00:00";
	String edt ="00:00";

	
	if(sbVo.getBoardno()!=0){
		sbVo = sbwDao.selectByNo(memno);
		rsVo = rsDao.selectRes(sbVo.getBoardno());
		Timestamp StDate = rsVo.getPlan_sdate();
		Timestamp EdDate = rsVo.getPlan_edate();
		Timestamp StTime = rsVo.getPlan_stime();
		Timestamp EdTime = rsVo.getPlan_etime();
		
		boardno = sbVo.getBoardno();
		boardtitle = sbVo.getBoardtitle();
		photo = sbVo.getPhoto();
		area = sbVo.getArea();
		address=sbVo.getAddress();
		aniSel = sbVo.getPettype();
		price = sbVo.getPrice();
		boardEtc = sbVo.getBoardetc();
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.text.SimpleDateFormat formatter2 = new java.text.SimpleDateFormat("HH:mm");
		std = formatter.format(StDate);
		edd = formatter.format(EdDate);
		stt = formatter2.format(StTime);
		edt = formatter2.format(EdTime);
	}
	
%>
<%@ include file="../../inc/navTop.jsp" %>
<div id=center-view>
	<%@ include file="../../inc/sideMenu.jsp" %>
	<section id=main-content>
	<h1 id="siInfo-title">구직 등록</h1>
	
	<div class="inner-box">
		<form method="post" action="sitterInfo_ok.jsp">
			<input type="text" name="boardno" value="<%=boardno%>"><br>
			<input type="text" name="boardtitle" value="<%=boardtitle%>" class="show-none"><br>
	
			<label>사진 첨부 :</label>
			<input type="file" name="boardphoto" id="imgInp"><br>
			<!-- 아래에 사진 경로 붙여주기 -->
			<img id="foo" src="<%=photo%>"><br>
			<label>지역 :</label>  <input type="text" name="area" value="<%=area%>"><br>
			<label>상세주소 : </label> <input type="text" name="address" value="<%=address%>"><br>
			<label>동물 종류 : </label>
			<select name="aniSel" id="aniSel">
				<option>-----</option>
				<option value=0>고양이</option>
				<option value=1>강아지</option>
				<option value=2>둘 다</option>
			</select>
			<br>
			<label>1일 가격 설정 :</label><input type="text" name="price" value="<%=price%>"><br>
			<label>상세 소개 :</label><input type="text" name="boardetc" value="<%=boardEtc%>"><br>
			
			<!-- 일정은 추가 시 버튼으로 form이 늘어나게? 해두겠습니다. -->
			<label>시작일 :</label> <input type="date" name="dateSt1" class="date" value="<%=std%>"><br>
			<label>종료일 :</label> <input type="date" name="dateEd1" class="date" value="<%=edd%>"><br>
			
			<label>시작 시간:</label> <input type="time" name="timeSt1" value="<%=stt%>"><br>
			<label>종료 시간:</label> <input type="time" name="timeEd1" value="<%=edt%>"><br>
			
			<!-- <div id="plus">+</div> -->
			
			
			<input type="submit" value="등록" class="in-btn">
			
		</form>
	</div>
	
	</section>
</div>
<script>
	var dateCount = 1;
	
	$(document).ready(function() {
		$("#plus").on("click", function() {
			dateCount++
			var startName = "dateSt"+dateCount;
			var endName = "dateEd"+dateCount;
			//var newitem = $(".date :eq(1)").clone();
			//$(".date").append(newitem);
			console.log($(".date :eq(1)"));
 
		})
	})
	
	 function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function(e) {
                $('#foo').attr('src', e.target.result);
            }
            reader.readAsDataURL(input.files[0]);
        }
    }

    $("#imgInp").change(function() {
        readURL(this);
    });
</script>

<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
