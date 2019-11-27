<%@page import="java.io.File"%>
<%@page import="com.herbmall.common.Utility"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.IOException"%>
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
	//edit.jsp에서 post방식으로 submit
	//=> 파라미터 읽어서 수정 처리
	//파일 업로드 처리
	String saveDir
		=config.getServletContext().getRealPath(Utility.UPLOAD_PATH);
	saveDir=application.getRealPath(Utility.UPLOAD_PATH);	
	saveDir=Utility.TEST_PATH;
	
	int maxSize=2*1024*1024;  //2M
	try{
		MultipartRequest mr
		=new MultipartRequest(request, saveDir, maxSize, "utf-8",
				new DefaultFileRenamePolicy());
		System.out.println("수정시 업로드 완료!");
				
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
		String no=mr.getParameter("no");
		String title=mr.getParameter("title");
		String name=mr.getParameter("name");
		String pwd=mr.getParameter("pwd");
		String email=mr.getParameter("email");
		String content=mr.getParameter("content");
		String oldFileName=mr.getParameter("oldFileName");
		
		//2
		ReBoardDAO dao=new ReBoardDAO();
		ReBoardVO vo=new ReBoardVO();
		vo.setNo(Integer.parseInt(no));
		vo.setContent(content);
		vo.setEmail(email);
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setTitle(title);
		vo.setFileName(fileName);
		vo.setOriginalFileName(originalFileName);
		vo.setFileSize(fileSize);
		
		if(dao.checkPwd(Integer.parseInt(no), pwd)){			
			int cnt=dao.updateReBoard(vo);
			
			//3
			if(cnt>0){ 
				//새로 업로드한 경우 기존 파일 삭제
				if(fileName!=null && !fileName.isEmpty()){
					if(oldFileName!=null && !oldFileName.isEmpty()){						
						File oldFile=new File(saveDir, oldFileName);
						if(oldFile.exists()){
							boolean bool=oldFile.delete();
							System.out.println("기존파일 삭제 결과 bool="
								+bool);
						}
					}
				}//if
			%>				
				<script type="text/javascript">
					alert("글 수정되었습니다.");
					location.href="detail.jsp?no=<%=no%>";
				</script>
			<%}else{%>
				<script type="text/javascript">
					alert("글 수정 실패!");
					history.go(-1);
				</script>
			<%}
		}else{%>
			<script type="text/javascript">
				alert("비밀번호가 일치하지 않습니다!");
				history.go(-1);
			</script>			
		<%}
	}catch(SQLException e){
		e.printStackTrace();
	}catch(IOException e){%>
		<script type="text/javascript">
			alert("2M 이상은 업로드할 수 없습니다!");
			history.go(-1);
		</script>			
	
	<%	e.printStackTrace();
	}
	
	
%>
</body>
</html>