<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function send(form){
		if(form.id.value==''){
			alert("아이디를 입력하세요");
			form.id.focus();
			return false;			
		}else if(form.pwd.value.length<1){
			alert("비밀번호를 입력하세요");
			form.pwd.focus();
			return false;			
		}else if(form.name.value.length<1){
			alert("이름을 입력하세요");
			form.name.focus();
			return false;			
		}
		
		return true;
	}
</script>
</head>
<body>
	<form name="frm1" method="post" action="register_ok.jsp"
		onsubmit="return send(this)">
		아이디 : <input type="text" name="id" maxlength="10"><br>
		비밀번호: <input type="password" name="pwd" maxlength="10"><br>
		이름 : <input type="text" name="name" ><br>
		휴대폰 번호 : <input type="text" name="hp"><br><br>

		<input type="submit" value="전송">
		<input type="reset" value="취소">	
	</form>
	
</body>
</html>