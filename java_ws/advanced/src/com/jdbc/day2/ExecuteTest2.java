package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteTest2 {

	public static void main(String[] args) {
		//execute() - insert, update, delete
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ �Է�!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		PreparedStatement ps=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			
			//2. Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db���� ����!");
			
			//3. PreparedStatement��ü ����
			String sql="insert into person(no, name, tel)" + 
					" values(person_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4. ����
			boolean bool=ps.execute();
			System.out.println("insert, bool="+bool);
			
			int cnt=ps.getUpdateCount(); //ó���� ���� ���� ����
			System.out.println("ó���� ���� ����:"+ cnt);
			
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
