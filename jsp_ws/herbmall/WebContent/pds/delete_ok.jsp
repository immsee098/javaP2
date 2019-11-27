<%@page import="com.herbmall.common.Utility"%>
<%@page import="java.io.File"%>
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
	String fileName=request.getParameter("fileName");
	
	//2
	ReBoardDAO dao=new ReBoardDAO();		
	try{
		if(dao.checkPwd(Integer.parseInt(no), pwd)){
			ReBoardVO vo = new ReBoardVO();
			vo.setNo(Integer.parseInt(no));
			vo.setGroupNo(Integer.parseInt(groupNo));
			vo.setStep(Integer.parseInt(step));
			
			dao.deleteReBoard(vo);
			
			//기존 파일 삭제
			if(fileName!=null && !fileName.isEmpty()){
				String upPath=application.getRealPath(Utility.UPLOAD_PATH);
				upPath=Utility.TEST_PATH;
				
				File file=new File(upPath, fileName);
				if(file.exists()){
					boolean bool=file.delete();
					System.out.println("기존 파일 삭제 여부 : "+ bool);
				}
			}
			
			%>
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