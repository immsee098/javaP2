<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxTest/ajaxTest3.jsp</title>
<script type="text/javascript" src="<c:url value='/resources/js/jquery-3.4.1.min.js'/>"></script>
<script type="text/javascript">
	$(function(){
		$("#query").click(function(){
			//{"no":22,"name":"홍길동","content":"안녕"}
			$.ajax({
				url:"<c:url value='/ajaxQuery.do'/>",
				type:"post",
				data:{ "no": $("#no").val()},
				dataType:"json",
				success:function(res){
					//alert(res);
					var str="번호 : "+ res.no+"<br>"
					+ "이름 : " + res.name+"<br>"
					+ "내용 : " + res.content+"<br><br>";
					
					$("#result").append(str);
				},
				error:function(xhr, status, error){
					alert("Error:"+status+","+error);
				}
			});
		});	
		
		//ajaxWrite.do
		$("#frm1").submit(function(){
			alert($(this).serializeArray());
			
			//{"message":"메모 등록 성공","data":{"no":10,"name":"홍길동","content":"안녕"}}
			$.ajax({
				url:"<c:url value='/ajaxWrite.do'/>",
				type:"post",
				/*data:{
					name: $("#name").val() ,
					content: $("#content").val()
				},*/
				//data:$(this).serialize(),
				data:$("#frm1").serializeArray(),				
				dataType:"json",
				success:function(res){
					//alert(res);
					var str="[등록 메시지:"+ res.message+"]<br>";
					str+="등록 결과 no="+res.data.no+"<br>";
					str+="name="+res.data.name+"<br>";
					str+="content="+res.data.content+"<br><br>";					
					
					$("#result").append(str);
				},
				error:function(xhr, status, error){
					alert("Error:"+ status+"=>"+ error);
				}
			});
			
			event.preventDefault();
		});	
	});
</script>
</head>
<body>
	<form id="frm1">
		 번호 : <input type="text" id="no" size="7"/>
		 <input type="button" id="query" value="조회"><br>
		
		 <h2>메모를 남기세요</h2>
		 이름 : <input type="text" id="name" name="name"/><br>
		 메모 : <input type="text" id="content" name="content" size="50" /><br>
		 <input type="submit" value="입력">
		     
		 <h2>결과</h2>
		 <div id="result" style="background:#eeeeee;width:500px"></div>
	</form>	
	
</body>
</html>


