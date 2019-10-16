package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest1 {

	public static void main(String[] args) {
		// execute 메서드 이용
		//테이블, sequence생서
		
		Connection con = null;
		PreparedStatement ps = null;
		//1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩");
			
			//2. db서버와 연결 위한 컨넥션
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3. sql문장 처리 위한 preparedstatement
			//table 생성
			String sql = "create table pd2\r\n" + 
					"(\r\n" + 
					"    no number primary key,\r\n" + 
					"    pdname varchar2(100) not null,\r\n" + 
					"    price number,\r\n" + 
					"    regdate date default sysdate\r\n" + 
					")";
			ps = con.prepareStatement(sql);
			
			//4.실행
			boolean bool = ps.execute();
			//=>모든 sql문을 실행가능
			//=>select문의 경우 true, 나머지는 false 리턴
			System.out.println("테이블 생성, bool="+bool);
			
			//sequence 생성
			sql="create sequence pd2_seq\r\n" + 
					"start with 1\r\n" + 
					"increment by 1\r\n" + 
					"nocache";
			ps = con.prepareStatement(sql);
			
			bool = ps.execute();
			System.out.println("sequence생성, bool="+bool);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) ps.close();
				if(con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
