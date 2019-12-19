<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

	<section class="side-navi">
	
	
        <div class="row-custom">
            <!-- 나중에 for문 돌려서 리스트 수 조절 -->
			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forUser/memberInfo.jsp">개인정보 조회/수정</a>
			</nav>

			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forUser/petInfo.jsp">반려동물 등록/관리</a>
			</nav>
			
			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forUser/reservation.jsp">예약 일정 확인</a>
			</nav>
			
			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forUser/diary.jsp">일지 확인</a>
			</nav>
			
			<!-- 이하 시터용 -->
			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forSitter/sitterInfo.jsp">시터 구직 관리</a>
			</nav>
			
			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forSitter/sitterResv.jsp">시터 예약 확인</a>
			</nav>
			
			<nav class="navbar navbar-light bg-light nav-height">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/myPage/forSitter/sitterDiary.jsp">일지 확인/작성</a>
			</nav>
		</div>
          
          
         <div class="card card-custom">
		  <img src="" class="card-img-top" alt="회원 사진">
		  <div class="card-body">
		    <h5 class="card-title">Card title</h5>
		    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
		    <a href="#" class="btn btn-primary">Go somewhere</a>
		  </div>
		</div>
    </section>
</body>
</html>