<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<html lang="ko">
<head>
<title>자유게시판 글 목록 - 허브몰</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />

<script type="text/javascript">	

</script>
<style type="text/css">
	body{
		padding:5px;
		margin:5px;
	 }	
</style>	
</head>	
<body>
<h2>자유게시판</h2>
<div class="divList">
<table class="box2"
	 	summary="기본 게시판에 관한 표로써, 번호, 제목, 작성자, 작성일, 조회수에 대한 정보를 제공합니다.">
	<caption>기본 게시판</caption>
	<colgroup>
		<col style="width:10%;" />
		<col style="width:50%;" />
		<col style="width:15%;" />
		<col style="width:15%;" />
		<col style="width:10%;" />		
	</colgroup>
	<thead>
	  <tr>
	    <th scope="col">번호</th>
	    <th scope="col">제목</th>
	    <th scope="col">작성자</th>
	    <th scope="col">작성일</th>
	    <th scope="col">조회수</th>
	  </tr>
	</thead> 
	<tbody>  
	  <!--게시판 내용 반복문 시작  -->		
		<tr  style="text-align:center">
			<td>1</td>
			<td style="text-align:left"><a href="detail.jsp">안녕하세요</a></td>
			<td>홍길동</td>
			<td>2015-04-15</td>
			<td>7</td>		
		</tr> 
	  <!--반복처리 끝  -->
	  </tbody>
</table>	   
</div>
<div class="divPage">
	<!-- 페이지 번호 추가 -->		
						
	<!-- [1][2][3][4][5][6][7][8][9][10] -->
	
	<!--  페이지 번호 끝 -->
</div>
<div class="divSearch">
   	<form name="frmSearch" method="post" action=''>
        <select name="searchCondition">
            <option value="title" >제목</option>
            <option value="content">내용</option>
            <option value="name">작성자</option>
        </select>   
        <input type="text" name="searchKeyword" title="검색어 입력">   
		<input type="submit" value="검색">
    </form>
</div>

<div class="divBtn">
    <a href='write.jsp' >글쓰기</a>
</div>

</body>
</html>

