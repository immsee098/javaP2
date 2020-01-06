<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../../inc/adminTop.jsp" %>

<script type="text/javascript" 
	src="<c:url value='/resources/js/member.js'/>"></script>

<script type="text/javascript">
	$(function(){
		$("#name").focus();
		
		$("#wr_submit").click(function(){
			if($("#name").val().length<1){
				alert("이름을 입력하세요");
				$("#name").focus();
				event.preventDefault();
			}else if(!validate_userid($("#userid").val())){
				alert("아이디는 영문대소문자,숫자,_만 가능!");
				$("#userid").focus();
				event.preventDefault();				
			}else if($("#pwd").val().length<1){
				alert("비밀번호를 입력하세요");
				$("#pwd").focus();
				event.preventDefault();				
			}else if($("#pwd").val()!=$("#pwd2").val()){
				alert("비밀번호가 일치하지 않습니다!");
				$("#pwd2").focus();
				event.preventDefault();	
			}else if($("#chkId").val()!='Y'){
				alert("아이디 중복확인을 하세요");
				$("#btnChkId").focus();
				event.preventDefault();			
			}else if($("#level").val().length<1){
				alert("레벨을 선택하셔야 합니다!");
				$("#level").focus();
				event.preventDefault();			
			}
			
		});
		
	});
	


</script>

<style type="text/css">
	.width_80{
		width:80px;
	}
	.width_350{
		width:350px;
	}	
</style>
<article>
<div class="divForm">
<form name="frm1" method="post" 
	action="<c:url value='/admin/manager/join.do'/>">
<fieldset>
	<legend>관리자 등록</legend>
    <div>        
        <label for="name">관리자명</label>
        <input type="text" name="name" id="name" style="ime-mode:active">
    </div>
    <div>
        <label for="userid">관리자ID</label>
        <input type="text" name="userid" id="userid"
        		style="ime-mode:inactive">&nbsp;
        <input type="button" value="중복확인" id="btChkAdminId" 
        	title="새창열림">
    </div>
    <div>
        <label for="pwd">비밀번호</label>
        <input type="Password" name="pwd" id="pwd">
    </div>
    <div>
        <label for="pwd2">비밀번호 확인</label>
        <input type="Password" name="pwd2" id="pwd2">
    </div>    
    <div>
        <label for="level">레벨</label>
        <select id="level" name="authCode">
        	<option value="">선택하세요</option>
        	<!-- 반복 시작 -->
        	<c:forEach var="map" items="${list }">
        		<option value="${map['AUTHCODE']}">
        			${map['AUTHNAME']}
        		</option>
        	</c:forEach>
        	<!-- 반복 끝 -->
        </select>   
    </div>
    <div class="center">
         <input type="submit" id="wr_submit" value="등록">
    </div>
</fieldset>

    <input type ="text" name="chkId" id="chkId">
        
</form>
</div>
</article>

<%@ include file="../../inc/adminBottom.jsp"%>
    