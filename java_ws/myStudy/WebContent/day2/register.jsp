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
			alert("���̵� �Է��ϼ���");
			form.id.focus();
			return false;			
		}else if(form.pwd.value.length<1){
			alert("��й�ȣ�� �Է��ϼ���");
			form.pwd.focus();
			return false;			
		}else if(form.name.value.length<1){
			alert("�̸��� �Է��ϼ���");
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
		���̵� : <input type="text" name="id" maxlength="10"><br>
		��й�ȣ: <input type="password" name="pwd" maxlength="10"><br>
		�̸� : <input type="text" name="name" ><br>
		�޴��� ��ȣ : <input type="text" name="hp"><br><br>

		<input type="submit" value="����">
		<input type="reset" value="���">	
	</form>
	
</body>
</html>