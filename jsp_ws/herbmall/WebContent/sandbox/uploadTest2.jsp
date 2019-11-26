<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sandbox/uploadTest2.jsp</title>
</head>
<body>
	<h1>여러개 파일 업로드 연습</h1>
	<form name="frm1" method="post" action="uploadTest2_ok.jsp"
		enctype="multipart/form-data">
		아이디 : <input type="text" name="id"><bR>
		파일첨부 : <input type="file" name="upfile1"><bR>
		<input type="file" name="upfile2"><bR>
		<input type="file" name="upfile3"><bR><br>
		<input type="submit" value="전송">		
	</form>
	
</body>
</html>






