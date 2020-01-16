<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxTest/ajaxTest2.jsp</title>
<script type="text/javascript" src="<c:url value='/resources/js/jquery-3.4.1.min.js'/>"></script>
<script type="text/javascript">
	$(function(){
		$('#bt1').click(function(){
			//{"no":1,"name":"홍길동","content":"내용1"}
			$.ajax({
				type:"get",
				url:"<c:url value='/ajaxDetail1.do'/>",
				dataType:"json",
				success:function(res){
					//alert(res);
					var str="번호 - " + res.no+"<br>"
						+ "이름 - " + res.name+"<br>"
						+ "내용 - "  + res.content+"<br><br>";
						
					$("#result").append(str);	
				},
				error:function(xhr, status, error){
					alert("Error : "+status+", "+ error);
				}
			});	
		});		
		
		$("#bt2").click(function(){
			//[{"no":1,"name":"김길동","content":"안녕"},{"no":2,"name":"이길동","content":"안녕하세요"},{"no":3,"name":"박길동","content":"내용입니다."}]
			$.ajax({
				url:"<c:url value='/ajaxList1.do'/>",
				type:"post",
				dateType:"json",
				success:function(res){
					//alert(res.length);
					if(res.length>0){
						var str="";
						$.each(res, function(idx, item){
							str+="이름:"+ item.name+", "
							+"번호:" + this.no+", "
							+"내용:" + item.content+"<br>";							
						});
						
						$("#result").append(str+"<br>");						
					}
				},
				error:function(xhr, status, error){
					alert("Error:"+ status+", "+ error);
				}
			});	
		});
		
		
	});
</script>
</head>

<body>
	<h1>ajax 연습2</h1>
	<button id="bt1">VO리턴</button>
	<button id="bt2">List리턴</button>
	<br>
	<hr>
	<div id="result"></div>
	
</body>
</html>


