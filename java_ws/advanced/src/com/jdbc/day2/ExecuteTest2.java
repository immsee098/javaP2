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
		System.out.println("�̸�, ���� �Է�!");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		// 1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db���� ����");
			
			String sql = "insert into person(no, name, tel)" + 
					" values(person_seq.nextval, ?, ?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//����
			boolean bool = ps.execute();
			System.out.println("insert, bool="+bool);
			
			int cnt = ps.getUpdateCount(); 
			System.out.println(cnt+"�� ����");
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
