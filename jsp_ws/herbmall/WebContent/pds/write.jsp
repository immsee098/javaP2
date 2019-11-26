<%@page import="com.herbmall.board.model.ReBoardVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//[1]글쓰기
	//[2]답변하기
	
	String no=request.getParameter("no");

	boolean replyFlag=false; //글쓰기
	ReBoardVO vo=null;
	
	if(no!=null && !no.isEmpty()){
		replyFlag=true; //답변하기		
		
		ReBoardDAO dao = new ReBoardDAO();
		try{
			vo=dao.selectByNo(Integer.parseInt(no));		
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
%>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />

<title>자료실 <%if(replyFlag){ %>
					답변하기
				<%}else{ %>
					글쓰기
				<%} %>	 
- 허브몰</title>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("form[name=frmWrite]").submit(function(){
			if($("#title").val()==''){
				alert("제목을 입력하세요");
				$("#title").focus();
				event.preventDefault();
			}else if($("#name").val().length<1){
				alert("이름을 입력하세요");
				$("#name").focus();
				event.preventDefault();
			}else if(!$("#pwd").val()){
				alert("비밀번호를 입력하세요");
				$("#pwd").focus();
				event.preventDefault();
			}
		});
	});
</script>

</head>
<body>
<div class="divForm">
<form name="frmWrite" method="post" enctype="multipart/form-data"
 	<%if(replyFlag){ %>
		action="reply_ok.jsp" 
	<%}else{ %>
		action="write_ok.jsp" 
	<%} %>
	>
	 <fieldset>
	 	<!-- 답변하기에서 필요한 hidden필드 -->
	 	<%if(replyFlag){ %>
	 		<input type="text" name="groupNo" 
	 			value="<%=vo.getGroupNo()%>">
	 		<input type="text" name="step" 
	 			value="<%=vo.getStep()%>">
	 		<input type="text" name="sortNo" 
	 			value="<%=vo.getSortNo()%>">
	 	<%} %>
	 	
		<legend>
			<%if(replyFlag){ %>
				답변하기
			<%}else{ %>
				글쓰기
			<%} %>
		</legend>
        <div class="firstDiv">
            <label for="title">제목</label>
            <input type="text" id="title" name="title" 
            	<%if(replyFlag){ %>
            		value="Re: <%=vo.getTitle() %>"
            	<%} %>
             />
        </div>
        <div>
            <label for="name">작성자</label>
            <input type="text" id="name" name="name" />
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" />
        </div>
        <div>
            <label for="email">이메일</label>
            <input type="text" id="email" name="email" />
        </div>
        <div>  
        	<label for="content">내용</label>        
 			<textarea id="content" name="content" rows="12" cols="40"></textarea>
        </div>
        <div>
            <label for="upfile">첨부파일</label>
            <input type="file" id="upfile" name="upfile" />
            (최대 2M)
        </div>
        
        <div class="center">
            <input type = "submit" 
            	<%if(replyFlag){ %>
            		value="답변"
            	<%}else{ %>
            		value="등록"
            	<%} %>
            />
            <input type = "Button" value="글목록" onclick="location.href	='list.jsp'" />         
        </div>
    </fieldset>
</form>
</div>   

              
</body>
</html>