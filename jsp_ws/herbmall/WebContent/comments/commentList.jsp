<!-- 윤해서 -->
<%@page import="com.herbmall.comments.model.CommentsService"%>
<%@page import="com.herbmall.comments.model.commentVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 
 	request.setCharacterEncoding("utf-8");
 
 	int num = Integer.parseInt(request.getParameter("no"));
 	
 	List<commentVO> list = null;
 	CommentsService dao = new CommentsService();
 	
	list=dao.selectComment(num);
 	
 %>

<ul>
	<%for(int i=0; i<list.size(); i++) {
		commentVO vo = list.get(i);
	%>
	
	<li>
		<div>댓글 넘버 : <%=vo.getNo() %></div>
		<div>작성자 : <%=vo.getName() %></div>
		<div>내용 : <%=vo.getContent() %></div>
	</li>
	<%
	}
	
	%>
</ul>