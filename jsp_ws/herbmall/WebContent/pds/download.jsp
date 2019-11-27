<%@page import="com.herbmall.common.Utility"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@page import="com.herbmall.board.model.ReBoardDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>download.jsp</title>
</head>
<body>
<%
	//detail.jsp에서 파일정보 링크 클릭하면 get방식으로 이동
	//=>[1] no에 해당하는 글의 다운로드수 증가
	//=>[2] 파일 다운로드 처리
	
	//1.
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){ %>
		<script type="text/javascript">
			alert("잘못된 url입니다.");
			location.href="list.jsp";
		</script>
	<%	return;
	}
	
	String fileName=request.getParameter("fileName");
	//System.out.println("filename="+fileName);
	
	String dir=application.getRealPath(Utility.UPLOAD_PATH);
	dir=Utility.TEST_PATH;
	File file=new File(dir, fileName);

	//2.
	ReBoardDAO dao=new ReBoardDAO();
	try{
		int cnt=dao.updateDownCount(Integer.parseInt(no));
		
		//3.
		//다운로드 처리
		
		//page의 설정을 바꾸기 위해서 response를 다 날려버림
		response.reset();
		
		//setContentType는 MIME 타입을 지정-octet-stream으로 지정시, 
		//형식을 지정하지 않겠다는 것		
		response.setContentType("application/octet-stream");
		
		//브라우저 파일 확장자를 포함하여 모든 확장자의 파일들에 대해 다운로드시 무조건 
		//파일다운로드 대화상자가 뜨도록 하는 헤더속성
		response.setHeader("Content-Disposition", 
				"attachment;filename="
			+ new String(fileName.getBytes("euc-kr"),"ISO-8859-1"));
		//=> url 전송시 ISO-8859-1 로 인코딩되므로 한글 처리 위해 인코딩

		out.clear();
		out=pageContext.pushBody();
		//=> 이를 생략하면 프로그램 상엔 이상이 없으나 이미 존재하고 있는
		//out객체로 바이트 기반의 스트림 작업을 명시하면서 오류가 발생함

		byte[] buf = new byte[1024*1024];
		BufferedInputStream bis 
			= new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos
			=new BufferedOutputStream(response.getOutputStream());
		int count=0;
		while((count=bis.read(buf))!=-1){
			bos.write(buf);
		}
		
		bis.close();
		bos.close();
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
	
%>
</body>
</html>


