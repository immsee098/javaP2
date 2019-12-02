<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useCookie.jsp</title>
</head>
<body>
	<%
		String idVal="", ageVal="";
		Cookie[] ckArr=request.getCookies();
		if(ckArr!=null){
			for(int i=0;i<ckArr.length;i++){
				String name=ckArr[i].getName();
				if(name.equals("id")){
					idVal=ckArr[i].getValue();							
				}else if(name.equals("age")){
					ageVal=ckArr[i].getValue();							
				}
			}//for
		}
	%>
	<h1>쿠키 값 읽어오기</h1>
	<p>id : <%=idVal %></p>
	<p>age : <%=ageVal %></p>
</body>
</html>








