<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파일 업로드 처리
	String upDir="pds_upload"; //업로드할 경로(저장 경로)
	
	//업로드할 경로 - 물리적인 경로 구하기
	String saveDir=config.getServletContext().getRealPath(upDir);
	System.out.println("1. saveDir="+saveDir);
	
	//또는
	saveDir=application.getRealPath(upDir);
	System.out.println("2. saveDir="+saveDir);
	
	saveDir="D:\\lecture\\workspace_list\\jsp_ws\\herbmall\\WebContent\\pds_upload";
	System.out.println("3. 테스트 경로 savDir="+saveDir);
	
	int maxSize=2*1024*1024;  //2M, 최대 업로드 용량
	String encoding="utf-8";
	
	String originalFileName="", fileName="",contentType="",
			id="", id2="", addr="";
	long fileSize=0;
	try{
		MultipartRequest mr = new MultipartRequest(request, saveDir,
				maxSize, encoding, new DefaultFileRenamePolicy());
		
		System.out.println("업로드 완료!");
		
		fileName=mr.getFilesystemName("upfile");
		
		if(fileName!=null && !fileName.isEmpty()){
			originalFileName=mr.getOriginalFileName("upfile");
			contentType=mr.getContentType("upfile");
			
			File file=mr.getFile("upfile");
			fileSize=file.length();
		}
		
		id=request.getParameter("id");  //null
		id2=mr.getParameter("id");
		addr=mr.getParameter("address");		
	}catch(IOException e){
		System.out.println("2M 이상은 파일 업로드 불가!!");
		e.printStackTrace();
	}

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파일 업로드 처리 결과</h1>
	<p>업로드된 파일명 : <%=fileName %></p>
	<p>변경전 파일명 : <%=originalFileName %></p>
	<p>contentType : <%=contentType %></p>
	<p>파일 크기: <%=fileSize %></p>
	<p>파라미터 id - request이용: <%=id %></p>
	<p>파라미터 id2 - mr이용: <%=id2 %></p>
	<p>주소 : <%=addr %></p>
	
	
</body>
</html>









