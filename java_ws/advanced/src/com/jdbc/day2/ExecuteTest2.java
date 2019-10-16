package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteTest2 {

	public static void main(String[] args) {
		// execute - insert, update, delete
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전번 입력!");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db연결 성공");
			
			String sql = "insert into person(no, name, tel)" + 
					" values(person_seq.nextval, ?, ?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//실행
			boolean bool = ps.execute();
			System.out.println("insert, bool="+bool);
			
			int cnt = ps.getUpdateCount(); 
			System.out.println(cnt+"행 리턴");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
