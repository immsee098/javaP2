<%@page import="com.herbmall.zipcode.model.ZipcodeVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.zipcode.model.ZipcodeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//[1] register.jsp에서 우편번호찾기 버튼 클릭하면 새창 띄우기
	//[2] zipcode.jsp에서 찾기버튼 클릭하면 post방식으로 submit
	
	//post
	request.setCharacterEncoding("utf-8");

	//1
	String dong=request.getParameter("dong");
	
	//2
	List<ZipcodeVO> list=null;
	if(dong!=null && !dong.isEmpty()){
		ZipcodeService service=new ZipcodeService();
		
		try{
			list=service.selectZipcode(dong);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	//3
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>zipcode/zipcode.jsp</title>
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css">
<style type="text/css">
	p, label{
		font-size: 0.9em;
	}
	.box2{
		width: 490px;
	}
	#divTable{
		width: 500px;
		margin: 15px 0;
	}
	h1{
		font-size: 1.5em;
		margin-bottom: 25px;
	}
	.error{
		color: red;
		display: none;
	}
</style>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("form[name=frm]").submit(function(){
			if($("#dong").val().length<1){
				$(".error").show();
				$("#dong").focus();
				event.preventDefault();
			}	
		});
		
	});
	
</script>
</head>
<body>
	<h1>우편번호 검색</h1>
	<p>찾고 싶으신 주소의 동(읍, 면)을 입력하세요</p>
	<form name="frm" method="post" action="zipcode.jsp">
		<label for="dong">지역명</label>
		<input type="text" name="dong" id="dong">
		<input type="submit" value="찾기">
		<span class="error">지역명을 입력하세요</span>
	</form>
	<%if(list!=null){ %>
		<div id="divTable">
			<table class="box2" 
			summary="우편번호 검색 결과에 관한 표로써  우편번호, 주소에 대한 정보를 제공합니다.">
				<colgroup>
					<col style="width:20%">
					<col style="width:*">
				</colgroup>
				<thead>
					<tr>
						<th scope="col">우편번호</th>
						<th scope="col">주소</th>
					</tr>	
				</thead>
				<tbody>
					<%if(list==null || list.isEmpty()){ %>
						<tr style="text-align: center">
							<td colspan="2">해당하는 주소가 존재하지 않습니다.</td>
						</tr>
					<%}else{ %>
						<!-- 반복시작 -->
						<%
							for(ZipcodeVO vo:list){
								String address = vo.getSido()+" "+vo.getGugun()+" "+vo.getDong();
								String sbunji = vo.getStartbunji();
								String ebunji = vo.getEndbunji();
								
								if(sbunji==null) {
									sbunji ="";	
								}
								String bunji="";
								if(ebunji !=null && ebunji.isEmpty()){
									bunji=sbunji+"~"+ebunji;
								} else{
									bunji=sbunji;
								}
								
								
							}
						%>
						
						<tr>
							<td></td>
							<td></td>						
						</tr>
						<!-- 반복끝 -->
					<%} %>				
				</tbody>
			</table>
			<div id="page"></div>
		</div>	
	<%}//if %>	
</body>
</html>












