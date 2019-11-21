<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>register_ok.jsp</title>
</head>
<body>
<%
	//post방식
	//요청 파라미터에 대한 한글 인코딩 처리
	request.setCharacterEncoding("euc-kr");

	//1. 요청 파라미터 읽어오기
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	String name=request.getParameter("name");	
	String hp=request.getParameter("hp");	
	
	//2. db작업
	Connection con=null;
	PreparedStatement ps=null;	
	try{
		//[1]
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 성공");
		
		//[2] con
		String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
		String user="testuser", upwd="testuser123";		
		con=DriverManager.getConnection(url, user, upwd);
		System.out.println("db연결 성공");
		
		//[3]ps
		String sql="insert into mem(no, id, pwd, name, hp)"
			+" values(mem_seq.nextval, ?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pwd);
		ps.setString(3, name);
		ps.setString(4, hp);
		
		//[4] exec
		int cnt=ps.executeUpdate();
		System.out.println("회원가입 결과:"+ cnt);
		
		//3. 결과 처리
		if(cnt>0){
			response.sendRedirect("index.jsp");
		}else{
			System.out.println("회원가입 실패!");
		}
	}catch(ClassNotFoundException e){
		System.out.println("class not found!");
		e.printStackTrace();
	}catch(SQLException e){
		System.out.println("sql error!");
		e.printStackTrace();
	}finally{
		
		if(ps!=null) ps.close();
		if(con!=null) con.close();
		
	}
	
	
	
	
%>

	
</body>
</html>




