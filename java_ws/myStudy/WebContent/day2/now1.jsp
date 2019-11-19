<%@page contentType="text/html;charset=euc-kr"%>
<%@page import = "java.util.Date" %>
<!-- page directive(페이지 지시자): 페이지에 대한 설정 정보-->

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> now1.jsp </TITLE>  
  <script >
   
  </script>
 </HEAD>

 <BODY>
<%
	//스크립트릿 - jsp코드를 넣는 곳
	Date d = new Date();
	String str= d.toLocaleString();
	out.println("<h1>오늘 날짜 : "+ str +"</h1>"); 
	/* out=> jsp 내장객체 
	   - 브라우저에 출력하라는 것*/
%>
  
  <h2>jsp 연습</h2>
  <p>현재 날짜는 <%=str%> 입니다.</p>
  <!-- 표현식 : out.println()과 동일 -->

<!-- http://localhost:9090/testsite/now1.jsp 
-->


 </BODY>
</HTML>
