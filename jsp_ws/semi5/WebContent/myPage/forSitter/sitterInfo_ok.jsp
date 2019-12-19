

<%@page import="com.model.reservation.resPossibleDAO"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.model.reservation.resPossibleVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.model.sitterPre.sBoardWriteDAO"%>
<%@page import="com.model.sitterPre.sBoardVO"%>
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
	
	String boardno = request.getParameter("boardno");
	String title = request.getParameter("boardtitle");
	String photo= request.getParameter("boardphoto");
	String photo2 = "../../images/"+photo;
	
	String area= request.getParameter("area");
	String address = request.getParameter("address");
	String aniSel= request.getParameter("aniSel");
	String price= request.getParameter("price");
	String boardetc= request.getParameter("boardetc");
	String dateSt1= request.getParameter("dateSt1");
	String dateEd1= request.getParameter("dateEd1");
	String timeSt1 = request.getParameter("timeSt1");
	String timeEd1 = request.getParameter("timeEd1");
	
	//넘어온 보드넘버가 0이면 insert
	//넘어온 보드넘버가 0이상이면 update
	sBoardVO sbVo = new sBoardVO();
	sBoardWriteDAO sbDao = new sBoardWriteDAO();
	resPossibleVO rpVo = new resPossibleVO();
	resPossibleDAO rpDao = new resPossibleDAO();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat dateFormat2 = new SimpleDateFormat("hh:mm");
	
	Date Stdate = dateFormat.parse(dateSt1);
	Date Eddate = dateFormat.parse(dateEd1);
	Date Sttime = dateFormat2.parse(timeSt1);
	Date Edtime = dateFormat2.parse(timeEd1);
	
	Timestamp std = new java.sql.Timestamp(Stdate.getTime());
	Timestamp edd = new java.sql.Timestamp(Eddate.getTime());
	Timestamp stt = new java.sql.Timestamp(Sttime.getTime());
	Timestamp edt = new java.sql.Timestamp(Edtime.getTime());
	
	sbVo.setBoardno(Integer.parseInt(boardno));
	sbVo.setBoardtitle(title);
	sbVo.setPhoto(photo2);
	sbVo.setArea(area);
	sbVo.setAddress(address);
	sbVo.setPettype(Integer.parseInt(aniSel));
	sbVo.setPrice(Integer.parseInt(price));
	sbVo.setBoardetc(boardetc);
	sbVo.setMemno(memno);
	
	rpVo.setPlan_sdate(std);
	rpVo.setPlan_edate(edd);
	rpVo.setPlan_stime(stt);
	rpVo.setPlan_etime(edt);
	
	//사진이 empty가 아닐때 update와 empty일때 update를 나눠두자 
	if(boardno.equals("0")){
		try{
			int cnt = sbDao.InsertSBoard(sbVo);

			if(cnt>0){ %>
				<script>
					alert("글 등록중");					
				</script>
				<%	
					
					int bdNo= sbDao.selectByNo(memno).getBoardno();
					rpVo.setBoardno(bdNo);
					
					int rpCnt = rpDao.insertRePos(rpVo);
					
				%>
				<script type="text/javascript">
					alert("등록 완료");	
					location.href="sitterInfo.jsp";				
				</script>
			<%} else {%>
				<script>
					alert("등록 실패");
					history.back();
				</script>
			<%}
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	} else if(photo=="" && !boardno.equals("0")) {
		try{
			rpVo.setBoardno(Integer.parseInt(boardno));
			int cnt = sbDao.UpdateNoPhoto(sbVo);
			int cnt2 = rpDao.updateRePos(rpVo);
			if(cnt>0){ %>
				<script>
					alert("글 업데이트-사진X");
					location.href="sitterInfo.jsp";
				</script>
			<%} else {%>
				<script>
					alert("등록 실패");
					history.back();
				</script>
			<%}
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	} else {
		try{
			int cnt = sbDao.UpdateSBoard(sbVo);
			if(cnt>0){ %>
				<script>
					alert("글 업데이트");
					location.href="sitterInfo.jsp";
				</script>
			<%} else {%>
				<script>
					alert("등록 실패");
					history.back();
				</script>
			<%}
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

%>


<h1>예약 정보</h1>
<section id=main-content>
  <p><%=dateSt1 %></p>
  <p><%=timeEd1 %></p>
</section>
<%@ include file="../../inc/footer.jsp" %>
</body>
</html>
