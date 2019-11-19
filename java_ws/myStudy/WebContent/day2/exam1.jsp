<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="examform1" method="post" action="exam1_ok.jsp" onsubmit="return send(this)">
		상호 : <input type="text" name="name"><br>
		업종 :
		한식<input type="radio" name="menu" value="한식">
		양식<input type="radio" name="menu" value="양식">
		일식<input type="radio" name="menu" value="일식">
		<br>
		지역 : <select name="loc">
			<option value="서울" >서울</option>
			<option value="부산" >부산</option>
			<option value="인천" >인천</option>
		</select>
		<br>
		주차<input type="checkbox" name="what" value="parking">
		쿠폰<input type="checkbox" name="what" value="cupon">
		시식평<input type="checkbox" name="what" value="review">
		<br>
		위치 : <input type="text" name="loca">
		<br>
		<input type ="submit" value="확인">
	</form>
</body>
</html>