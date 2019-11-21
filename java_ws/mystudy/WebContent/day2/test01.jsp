<%@page contentType="text/html;charset=euc-kr" %>

<%!
	//선언부 - 멤버변수나 메서드를 선언하는 부분
	String id;

	public int add(int a, int b){
		return a+b;
	}
%>

<%
	//스크립트릿 - jsp코드를 넣는 부분
	//여기에서 선언한 변수는 모두 지역변수임
	int num=10;
	
	int result=add(20,30);

	out.println("멤버변수 id="+id+"<br>");
	out.println("지역변수 num="+num+"<br>");
	out.print("<p>두수의 합:"+ result+"</p>");

	id="hong";
%>
<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>
 <BODY>
  <h1>변경된 멤버변수 id : <%=id%></h1>

 </BODY>
</HTML>
