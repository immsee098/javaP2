package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest1 {

	public static void main(String[] args) {
		//execute() 메서드 이용
		//테이블, sequence 생성

		Connection con=null;
		PreparedStatement ps=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩!");
			
			//2. db서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3. sql문장을 처리하기 위한 PreparedStatement객체 생성
			//table 생성
			String sql="create table pd2" + 
					"(" + 
					"    no  number primary key," + 
					"    pdname varchar2(100) not null," + 
					"    price number," + 
					"    regdate date default sysdate" + 
					")";
			ps=con.prepareStatement(sql);
			
			//4. 실행
			boolean bool=ps.execute();
			//=> 모든 sql문을 실행할 수 있다
			//=> select문의 경우 true를 리턴, 나머지는 false를 리턴
			System.out.println("테이블 생성, bool="+bool);
			
			//sequence 생성
			sql="create sequence pd2_seq" + 
					" start with 1" + 
					" increment by 1" + 
					" nocache";
			ps=con.prepareStatement(sql);
			
			bool=ps.execute();
			System.out.println("sequence생성, bool="+bool);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
