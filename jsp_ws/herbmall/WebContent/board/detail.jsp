<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>자유게시판 상세보기 - 허브몰</title>
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />
<style type="text/css">
	body{
		padding:5px;
		margin:5px;
	 }
	.divForm {
		width: 500px;
		}
</style>  
</head>
<body>
	<h2>글 상세보기</h2>
	<div class="divForm">
		<div class="firstDiv">
			<span class="sp1">제목</span> <span>안녕하세요</span>
		</div>
		<div>
			<span class="sp1">작성자</span> <span>홍길동</span>
		</div>
		<div>
			<span class="sp1">등록일</span> <span>2015-04-16</span>
		</div>
		<div>
			<span class="sp1">조회수</span> <span>7</span>
		</div>
		<div class="lastDiv">			
			<p class="content">내용입니다</p>
		</div>
		<div class="center">
			<a href='edit.jsp'>수정</a> |
        	<a href='delete.jsp'>삭제</a> |
        	<a href='list.jsp'>목록</a>			
		</div>
	</div>

	
</body>
</html>