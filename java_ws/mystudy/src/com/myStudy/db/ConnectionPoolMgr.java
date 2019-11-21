package com.mystudy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionPoolMgr {

	public ConnectionPoolMgr(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!");
			e.printStackTrace();
		}		
	}
	
	public Connection getConnection(String url, String user, String upwd) 
			throws SQLException {
		Connection con=DriverManager.getConnection(url, user, upwd);
		System.out.println("db연결 결과 con="+ con);
		
		return con;
	}
	
	public Connection getConnection(String user, String upwd) 
			throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:xe";
		
		return getConnection(url, user, upwd);
	}
	
	public Connection getConnection() 
			throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:xe";
		String user="testuser", upwd="testuser123";
		
		return getConnection(url, user, upwd);
	}
	
	public void dbClose(ResultSet rs, PreparedStatement ps,
			Connection con) throws SQLException {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}

	public void dbClose(PreparedStatement ps,
			Connection con) throws SQLException {
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}

	
	
}
