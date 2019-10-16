package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전번 입력!");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		
		Connection con = null;
		CallableStatement cs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", upwd="testuser123";
			con = DriverManager.getConnection(url, user,upwd);
			System.out.println("db연결 성공");
			
			String sql = "call personInsert(?,?)";
			cs = con.prepareCall(sql);
			
			cs.setString(1, name);
			cs.setString(2, tel);
			
			boolean bool = cs.execute();
			System.out.println("저장 프로시저, bool="+bool);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
