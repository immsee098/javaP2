<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	
	String name = request.getParameter("name");
	String menu = request.getParameter("menu");
	String[] loc1 = request.getParameterValues("loc1");
	String[] sel = request.getParameterValues("what");
	String loc2 = request.getParameter("loca");
	
	String select = "";
	if(sel!=null){
		for(int i =0; i<sel.length;i++){
			select += sel[i]+" ";
		}
	}
%>

	<h1>====����ڰ� �Է��� ��====</h1>
	<p>��ȣ : <%=name %></p>
	<p>���� : <%=menu %></p>
	<p>���� : <%=loc1 %></p>
	<p>��ġ : <%=loc2 %></p>
	<p>��Ÿ �ɼ� : <%=select %></p>
	<p>------------------------------</p>
	<p>�����ͺ��̽��� �����մϴ�.</p>
</body>
</html>