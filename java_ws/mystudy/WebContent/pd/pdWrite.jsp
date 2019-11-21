<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pd/pdWrite.jsp</title>
</head>
<body>
	<h1>상품 등록</h1>
	<form name="frmWrite" method="post" action="pdWrite_ok.jsp">
		상품명 : <input type="text" name="pdName"><br>
		가격 : <input type="text" name="price"><br><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
	
	<br>
	<a href="pdList.jsp">상품목록으로</a>
	
</body>
</html>




