package com.jdbc.day1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SelectTest {

	public static void main(String[] args) {
		//select
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			//2. 데이터베이스 서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3. sql문장을 처리할 PreparedStatement객체 생성
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			//4. 실행
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String tel=rs.getString("tel");
				//String tel=rs.getString(3);
				Date regdate=rs.getDate("regdate");
				Timestamp regdate2=rs.getTimestamp("regdate");
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"
						+ regdate +"\t"+ regdate2);
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("class not found!");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("sql예외");
			e.printStackTrace();
		}finally {
			//5. 자원반납, 접속 종료
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
