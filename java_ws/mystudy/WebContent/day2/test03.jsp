<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
  <%
//=> http://172.16.146.1:9090/samplesite/day2/test03.jsp?no=5&name=홍길동

	//get방식으로 전송

	//요청 파라미터 읽어오기
	String no=request.getParameter("no");
	String name=request.getParameter("name");
  %>
  <h1>get방식으로 전송된 요청 파라미터 값</h1>
  <p>번호 : <%=no%></p>
  <p>이름 : <%=name%></p>

 </BODY>
</HTML>
