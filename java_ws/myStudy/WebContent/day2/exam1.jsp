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
		��ȣ : <input type="text" name="name"><br>
		���� :
		�ѽ�<input type="radio" name="menu" value="�ѽ�">
		���<input type="radio" name="menu" value="���">
		�Ͻ�<input type="radio" name="menu" value="�Ͻ�">
		<br>
		���� : <select name="loc">
			<option value="����" >����</option>
			<option value="�λ�" >�λ�</option>
			<option value="��õ" >��õ</option>
		</select>
		<br>
		����<input type="checkbox" name="what" value="parking">
		����<input type="checkbox" name="what" value="cupon">
		�ý���<input type="checkbox" name="what" value="review">
		<br>
		��ġ : <input type="text" name="loca">
		<br>
		<input type ="submit" value="Ȯ��">
	</form>
</body>
</html>