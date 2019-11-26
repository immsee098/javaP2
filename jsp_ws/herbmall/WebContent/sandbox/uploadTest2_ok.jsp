<%@page import="java.nio.file.Files"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여러개 파일 업로드 결과</h1>
	
<%
	String upDir="pds_upload";
	String saveDir=config.getServletContext().getRealPath(upDir);
	saveDir=application.getRealPath(upDir);
	saveDir="D:\\lecture\\workspace_list\\jsp_ws\\herbmall\\WebContent\\pds_upload";
	
	int maxSize=2*1024*1024;
	String fileName="", originalFileName="";
	long fileSize=0;
	try{
		MultipartRequest mr
		=new MultipartRequest(request, saveDir, maxSize, "utf-8",
				new DefaultFileRenamePolicy());
		System.out.println("업로드 완료!!!");
		
		Enumeration en=mr.getFileNames();
		while(en.hasMoreElements()){
			String name=(String)en.nextElement();
			
			fileName=mr.getFilesystemName(name);
			if(fileName!=null && !fileName.isEmpty()){
				originalFileName=mr.getOriginalFileName(name);
				File file=mr.getFile(name);
				fileSize=file.length();%>
				
				<p>업로드 파일명 : <%=fileName %></p>
				<p>변경전 파일명 : <%=originalFileName %></p>
				<p>파일크기 : <%=fileSize %></p>
			<%}
		}
	}catch(IOException e){
		System.out.println("2M이상 파일 업로드 불가!");
		e.printStackTrace();
	}
%>    
</body>
</html>




