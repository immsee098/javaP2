package com.java1017;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		//INSERT
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전번 입력!");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", pwd="testuser123";
			con = DriverManager.getConnection(url, user,pwd);
			System.out.println("db연결 성공");
			
			String sql = "update mem\r\n" + 
					"set name=?, hp=?\r\n" + 
					"where no = ?";
			ps = con.prepareStatement(sql);
	
	
			ps.setString(1, name);
			ps.setString(2, hp);
			int cnt = ps.executeUpdate();
			
			
			
		} catch(ClassNotFoundException e) {
			System.out.println("class not found!");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("sql예외!");
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}