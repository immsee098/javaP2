<%@page import="java.sql.SQLException"%>
<%@page import="com.model.mypage.sDiaryVO"%>
<%@page import="com.model.mypage.sDiaryDAO"%>
<%@page import="com.model.reservation.petInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아워시터</title>
</head>
<%
	request.setCharacterEncoding("utf-8");

	int s_memno = 263;
	int s_no = s_memno+100;
	
	petInfoDAO petDao = new petInfoDAO();
	
	String petno = request.getParameter("petno");
	String memno = request.getParameter("memno");
	String memberName = request.getParameter("memberName");
	String pets = petDao.selectPetName(Integer.parseInt(petno));
	String content = request.getParameter("content");
	String filename = request.getParameter("filename");
	
	sDiaryDAO sdiaryDao = new sDiaryDAO();
	sDiaryVO sdiaryVo = new sDiaryVO();
	
	sdiaryVo.setS_No(s_no);
	sdiaryVo.setPetName(pets);
	sdiaryVo.setD_content(content);
	sdiaryVo.setD_photo("../../images/"+filename);
	sdiaryVo.setMemNo(Integer.parseInt(memno));
	sdiaryVo.setPetNo(Integer.parseInt(petno));
	
	try{
		int cnt = sdiaryDao.insertDiary(sdiaryVo);
		
		if(cnt>0){%>
			<script type="text/javascript">
				alert("글이 등록되었습니다");
				location.href="sitterDiaryList.jsp";
			</script>
		<%}else{%>
			<script type="text/javascript">
				alert("글 등록 실패");
				history.back();
			</script>
		<%}
	} catch(SQLException e){
		e.printStackTrace();
	}	
%>

</body>
</html>
