<!DOCTYPE html>
<html>
<head>

<style>
	#contents{
		width: 100%;
		height: 200px;
	}
</style>
</head>
<body>

<div>
	<form name="comWrite" method="post" action="writeComm_ok.jsp?no=<%=no%>">
		<label for="name">이름</label>
		<input type="text" id="name" name="name">
		
		<label for="pwd">비밀번호</label>
		<input type="text" id="pwd" name="pwd">
		
		<input type="text" id="contents" name="contents">
		
		<input type="submit" value="확인">
	</form>
</div>

</body>
</html>