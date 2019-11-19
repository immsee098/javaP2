<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
 </HEAD>

 <BODY>
  <%
	//post방식으로 전송
	//요청 파라미터에 대한 한글 인코딩 처리
	request.setCharacterEncoding("euc-kr");

	//요청 파라미터 읽어오기
	String name=request.getParameter("name");
	String addr=request.getParameter("address");
	String agree=request.getParameter("agree");
	
	//다중 선택인 경우
	String[] petArr=request.getParameterValues("pet");

	String pets="";
	if(petArr!=null){
		for(int i=0;i<petArr.length;i++){
			pets +=petArr[i]+" ";
		}
	}
  %>

  <h1>사용자 입력값 - 요청 파라미터의 값들</h1>
  <p>이름 : <%=name%></p>
  <p>주소 : <%=addr%></p>
  <p>동의여부 : <%=agree%></p>
  <p>좋아하는 동물 : <%=pets%></p>

 </BODY>
</HTML>
