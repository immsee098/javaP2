package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ExecuteTest3 {

	public static void main(String[] args) {
		//execute() - select
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");

			//2. Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db연결 성공!");
			
			//3. PreparedStatement 객체 생성
			String sql="select * from person"
					+ " order by no desc";
			ps=con.prepareStatement(sql);
			
			//4. 실행
			boolean bool=ps.execute();
			System.out.println("select, bool="+bool);
			
			rs=ps.getResultSet(); //ResultSet을 리턴
			while(rs.next()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String tel=rs.getString(3);
				Timestamp regdate=rs.getTimestamp(4);
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
