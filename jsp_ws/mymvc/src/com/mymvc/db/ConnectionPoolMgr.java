package com.mymvc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//톰캣 dbcp를 이용하여 커넥션 객체를 빌려오는 클래스
public class ConnectionPoolMgr {
	private DataSource ds;
	
	public ConnectionPoolMgr(){
		Context ctx;
		try {
			ctx = new InitialContext();
			ds=(DataSource) ctx.lookup("java:/comp/env/jdbc/oracledb");
			System.out.println("dbcp-DataSource 생성 성공!");
		} catch (NamingException e) {
			System.out.println("dbcp-DataSource 생성 실패!");
			e.printStackTrace();
		}
	}	
	
	public Connection getConnection() throws SQLException {
		Connection con= ds.getConnection();
		System.out.println("db연결 결과 con="+con);
		return con;
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
