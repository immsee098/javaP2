<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/top.jsp" %>

<article id="centerCon">
	<img src="${pageContext.request.contextPath }/resources/images/herb.JPG" alt="허브 이미지">
	<h2>메인 페이지</h2>
</article>
<article id="rightCon">
	<!-- 공지사항 -->
	<c:import url="/notice/mainNotice.do"></c:import>
</article>
<article id="listCon">
	<p>상품 목록</p>
</article>


<%@include file="inc/bottom.jsp" %>



