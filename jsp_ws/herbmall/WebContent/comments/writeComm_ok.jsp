<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.herbmall.comments.model.commentVO"%>
<%@page import="com.herbmall.comments.model.commentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>

	<%
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
		Date date = new Date();
		String regdate = format1.format(date);
		
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String bdno = request.getParameter("no");
		String content = request.getParameter("content");
		
		commentDAO dao = new commentDAO();
		commentVO vo = new commentVO();
		
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setRegdate(regdate);
		vo.setContent(content);
		vo.setBdno(Integer.parseInt(bdno));
		
	%>

</html>