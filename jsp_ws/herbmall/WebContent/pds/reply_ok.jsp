<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.herbmall.common.Utility"%>
<%@page import="com.herbmall.board.model.ReBoardVO"%>
<%@page import="java.sql.SQLException"%>
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
	//write.jsp에서 [답변]클릭하면 post방식으로 submit
	//=> 해당 글에 대한 답변 처리-insert
		
	String saveDir
		=config.getServletContext().getRealPath(Utility.UPLOAD_PATH);
	saveDir=application.getRealPath(Utility.UPLOAD_PATH);	
	saveDir=Utility.TEST_PATH;
	
	int maxSize=2*1024*1024;  //2M
	try{
		MultipartRequest mr
		=new MultipartRequest(request, saveDir, maxSize, "utf-8",
				new DefaultFileRenamePolicy());
		System.out.println("답변하기시 업로드 완료!");
				
		//업로드한 파일 정보 얻어오기
		String fileName=mr.getFilesystemName("upfile");
		long fileSize=0;
		String originalFileName="";
		if(fileName!=null && !fileName.isEmpty()){
			File file=mr.getFile("upfile");
			fileSize=file.length();
			
			originalFileName=mr.getOriginalFileName("upfile");
		}
		
		//1
		String title=mr.getParameter("title");
		String name=mr.getParameter("name");
		String pwd=mr.getParameter("pwd");
		String email=mr.getParameter("email");
		String content=mr.getParameter("content");
		String groupNo=mr.getParameter("groupNo");
		String step=mr.getParameter("step");
		String sortNo=mr.getParameter("sortNo");
				
		//2.
		ReBoardDAO dao=new ReBoardDAO();
		ReBoardVO vo=new ReBoardVO();
		vo.setContent(content);
		vo.setEmail(email);
		vo.setGroupNo(Integer.parseInt(groupNo));
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setSortNo(Integer.parseInt(sortNo));
		vo.setStep(Integer.parseInt(step));
		vo.setTitle(title);
		vo.setFileName(fileName);
		vo.setOriginalFileName(originalFileName);
		vo.setFileSize(fileSize);
				
		int cnt=dao.reply(vo);
		
		//3.
		if(cnt>0){%>
			<script type="text/javascript">
				alert("답변처리되었습니다.");
				location.href="list.jsp";
			</script>
		<%}else{%>
			<script type="text/javascript">
				alert("답변처리 실패");
				history.back();
			</script>
		<% }
	}catch(SQLException e){
		e.printStackTrace();
	}		
		
	%>
</body>
</html>









