package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ResultTest {

	public static void main(String[] args) {
		//ResultSet의 커서 이용
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", pwd="testuser123";
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			String sql="select * from person";
			ps = con.prepareStatement(sql,
						ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
			
			//실행
			rs=ps.executeQuery();
			rs.afterLast();
			while(rs.previous()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				Timestamp regdate = rs.getTimestamp(4);
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);
			}
			
			rs.absolute(2);
			System.out.println("no:"+rs.getInt(1)+", name="+rs.getString(2));
			System.out.println("현재행 - "+rs.getRow());
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null)
				try {
					rs.close();
					if(ps!=null) ps.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
