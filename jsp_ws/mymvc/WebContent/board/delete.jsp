<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//detail.jsp에서 [삭제]링크 클릭하면 get방식으로 이동	
	String no=request.getParameter("no");
%>
	 
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>자유게시판 글 삭제 - 허브몰</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/clear.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mystyle.css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.4.1.min.js"></script>
<style type="text/css">
	body{
		padding:5px;
		margin:5px;
	 }
	.divForm{
		width:650px;
		border:1px solid #ddd;		
	}
	/* .divForm form{
		width:650px;
	} */
	.divForm div	{
		/* clear: both; */
		border:none;
		padding: 7px 0;
		margin: 0;
		overflow: auto;
	}	
	.sp{
		font-size:0.9em;
		color:#0056AC;			
	}
	.divForm fieldset	{
		border:0;
	}
</style>

<script type="text/javascript">
	$(function(){
		$('form[name=frmDelete]').submit(function(){
			if($('#pwd').val().length<1){
				alert('비밀번호를 입력하세요');
				$('#pwd').focus();
				event.preventDefault();
			}else{			
				if(!confirm('삭제하시겠습니까?')){
					event.preventDefault();
				}
			}
		});
	});
</script>
</head>
<body>
<div class="divForm">
	<form name="frmDelete" method="post"	
		action="<%=request.getContextPath() %>/board/delete_ok.do" >
		<!-- hidden -->
        <input type="hidden" name="no" value="<%=no %>" />   
		<fieldset>
		<legend>글 삭제</legend>
	        <div>           
	        	<span class="sp"><%=no %>번 글을 삭제하시겠습니까?</span>                        
	        </div>
	        <div>           
	            <label for="pwd">비밀번호</label>
	            <input type="password" id="pwd" name="pwd" />   
	        </div>
	        <div class="center">
	            <input type ="submit"  value="삭제" />
	            <input type = "Button" value="글목록" 
                	OnClick
      ="location.href='<%=request.getContextPath()%>/board/list.do'" />
	        </div>
	    </fieldset>
    </form>
</div>

</body>
</html>