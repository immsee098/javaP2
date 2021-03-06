<%@page import="com.mymvc.board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//detail.jsp에서 [수정]링크 클릭하면 get방식으로 이동
	//=> no에 해당하는 글 조회해서 출력
	//=> http://localhost:9090/herbmall/board/edit.jsp?no=4
	
	//request에 저장된 결과 읽어오기
	BoardVO vo=(BoardVO)request.getAttribute("boardVo");
		
	//3
	String email=vo.getEmail();
	String content=vo.getContent();
	if(email==null) email="";
	if(content==null) content="";
	
%>    
<!DOCTYPE html>
<html lang="ko">
<head>
<title>자유게시판 글 수정 - 허브몰</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/clear.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mystyle.css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.4.1.min.js"></script>

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
<form name="frmEdit" method="post" 
	action="<%=request.getContextPath() %>/board/edit_ok.do"> 
    <!-- 수정처리시 no가 필요하므로 hidden 필드에 넣는다-->
    <input type="hidden" name="no" value="<%=vo.getNo()%>">
    
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
            <input type = "Button" value="글목록" 
onclick="location.href='<%=request.getContextPath()%>/board/list.do'" />         
        </div>
	</fieldset>
</form>    
</div>

</body>
</html>