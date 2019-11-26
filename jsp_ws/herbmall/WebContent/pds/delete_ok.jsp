<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.ReBoardVO"%>
<%@page import="com.herbmall.board.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//delete.jsp에서 post방식으로 submit
	//=> 파라미터 읽어서 삭제 처리
	
	//post
	request.setCharacterEncoding("utf-8");
	
	//1
	String no=request.getParameter("no");
	String pwd=request.getParameter("pwd");
	String groupNo=request.getParameter("groupNo");
	String step=request.getParameter("step");
	
	//2
	ReBoardDAO dao=new ReBoardDAO();		
	try{
		if(dao.checkPwd(Integer.parseInt(no), pwd)){
			ReBoardVO vo = new ReBoardVO();
			vo.setNo(Integer.parseInt(no));
			vo.setGroupNo(Integer.parseInt(groupNo));
			vo.setStep(Integer.parseInt(step));
			
			dao.deleteReBoard(vo);%>
			<script type="text/javascript">
				alert("글 삭제되었습니다.");
				location.href="list.jsp";
			</script>			
			<%
		}else{ %>
			<script type="text/javascript">
				alert("비밀번호가 일치하지 않습니다!");
				history.go(-1);
			</script>	
	<%  }
	}catch(SQLException e){
		e.printStackTrace(); %>
		
		<script type="text/javascript">
			alert("글삭제 중 에러 발생!");
			history.go(-1);
		</script>	
	<%}
	
	
%>
</body>
</html>