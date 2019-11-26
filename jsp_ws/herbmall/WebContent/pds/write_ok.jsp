<%@page import="java.io.File"%>
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
<title>write_ok.jsp</title>
</head>
<body>
	<%
		//write.jsp에서 post방식으로 submit
		//=> 파라미터 읽어서 reBoard에 insert
		//파일 업로드 처리
		String upDir="pds_upload";
		
		//업로드할 폴더 - 실제 물리적인 경로 구하기
		String saveDir=config.getServletContext().getRealPath(upDir);
		saveDir=application.getRealPath(upDir);
		System.out.println("saveDir="+saveDir);
		
		saveDir="D:\\lecture\\workspace_list\\jsp_ws\\herbmall\\WebContent\\pds_upload";
		System.out.println("테스트경로 saveDir="+saveDir);
		
		int maxSize=2*1024*1024; //업로드할 최대용량 2M
		
		try{
			MultipartRequest mr
			=new MultipartRequest(request, saveDir, maxSize, "utf-8",
					new DefaultFileRenamePolicy());
			
			System.out.println("파일 업로드 완료!");
			
			String fileName=mr.getFilesystemName("upfile");
			String originalFName="";
			long fileSize=0;
			//파일 업로드한 경우
			if(fileName!=null && !fileName.isEmpty()){
				originalFName=mr.getOriginalFileName("upfile");
				
				File file=mr.getFile("upfile");
				fileSize=file.length();
			}
			
			//1.
			String title=mr.getParameter("title");
			String name=mr.getParameter("name");
			String pwd=mr.getParameter("pwd");
			String email=mr.getParameter("email");
			String content=mr.getParameter("content");
			
			String ip=request.getRemoteAddr();
			String ip2=request.getRemoteHost();
			System.out.println("ip="+ip+", ip2="+ip2);
			
			//2.
			ReBoardDAO dao=new ReBoardDAO();
			ReBoardVO vo = new ReBoardVO();
			vo.setContent(content);
			vo.setEmail(email);
			vo.setName(name);
			vo.setPwd(pwd);
			vo.setTitle(title);
			vo.setFileName(fileName);
			vo.setOriginalFileName(originalFName);
			vo.setFileSize(fileSize);
			
			int cnt=dao.insertReBoard(vo);	
			
			//3.
			if(cnt>0){%>
				<script type="text/javascript">
					alert("글등록되었습니다.");
					location.href="list.jsp";
				</script>
			<%}else{%>
				<script type="text/javascript">
					alert("글등록 실패!");
					history.back();
				</script>
			<%}
		}catch(SQLException e){
			e.printStackTrace();
		}catch(IOException e){%>
			<script type="text/javascript">
				alert("2M 이상은 업로드할 수 없습니다!");
				history.back();
			</script>
		<%	e.printStackTrace();
		}
		
	%>
</body>
</html>



