<%@page import="com.herbmall.board.model.ReBoardVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//detail.jsp에서 [수정]링크 클릭하면 get방식으로 이동
	//=> no에 해당하는 글 조회해서 출력
	//=> http://localhost:9090/herbmall/reBoard/edit.jsp?no=4
	
	//1
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){ %>
		<script type="text/javascript">
			alert("잘못된 url입니다.");
			location.href="list.jsp";
		</script>
		
	<%	return;	
	}
	
	//2
	ReBoardDAO dao=new ReBoardDAO();
	ReBoardVO vo=null;
	try{
		vo=dao.selectByNo(Integer.parseInt(no));	
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3
	String email=vo.getEmail();
	String content=vo.getContent();
	if(email==null) email="";
	if(content==null) content="";
	
%>    
<!DOCTYPE html>
<html lang="ko">
<head>
<title>답변형 게시판 글 수정 - 허브몰</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>

<script type="text/javascript">
	$(function(){
		$(".divForm input[type=submit]").click(function(){
			$(".infobox").each(function(idx, item){
				if($(this).val().length<1){
					alert($(this).prev().text() + "을 입력하세요");
					$(this).focus();
					event.preventDefault(); //이벤트 진행을 막는다
					
					return false;  //each 탈출
				}
			});
		});
	});
</script>

</head>
<body>
<div class="divForm">
<form name="frmEdit" method="post" action="edit_ok.jsp"> 
    <!-- 수정처리시 no가 필요하므로 hidden 필드에 넣는다-->
    <input type="hidden" name="no" value="<%=no%>">
    
    <fieldset>
	<legend>글수정</legend>
        <div class="firstDiv">
            <label for="title">제목</label>
            <input type="text" id="title" name="title"  
            	value="<%=vo.getTitle()%>" class="infobox" />
        </div>
        <div>
            <label for="name">작성자</label>
            <input type="text" id="name" name="name" 
            	value="<%=vo.getName()%>" class="infobox"/>
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" class="infobox"/>
        </div>
        <div>
            <label for="email">이메일</label>
            <input type="text" id="email" name="email" 
            	value="<%=email%>"/>
        </div>
        <div>  
        	<label for="content">내용</label>        
 			<textarea id="content" name="content" rows="12" cols="40"><%=content%></textarea>
        </div>
        <div class="center">
            <input type = "submit" value="수정"/>
            <input type = "Button" value="글목록" onclick="location.href	='list.jsp'" />         
        </div>
	</fieldset>
</form>    
</div>

</body>
</html>