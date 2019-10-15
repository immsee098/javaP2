package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest {

	public static void main(String[] args) {
		//INSERT
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���� �Է�!");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			//1.�����ͺ��̽��� �����ϴ� ����̹� Ŭ���� ã��(����̹� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver"); //�궧�� Ŭ���� �ͼ��� �ʿ�
			//����̹� �ε�
			System.out.println("����̹� �ε� ����");
			//2.�����ͺ��̽� ������ �����ϱ� ���� Connection ��ü ����
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", pwd="testuser123";
			con = DriverManager.getConnection(url, user,pwd);
			System.out.println("db���� ����");
			//3. sql ������ ó���� PreparesStatement ��ü ����
			String sql = "insert into person(no, name, tel)" + 
					" values(person_seq.nextval, ?, ?)";
			ps = con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4. ���� 
			int cnt = ps.executeUpdate(); //ó���� ���� ���� ����
			System.out.println(cnt+"�� ���� �Էµ�!");
			
			
		} catch(ClassNotFoundException e) {
			System.out.println("class not found!");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("sql����!");
			e.printStackTrace();
		} finally {
			//5. �ڿ��ݳ� ��������
			try {
				if(ps!=null) ps.close(); //�̰� null�̰� if�� ���� ������
				if(con!=null) con.close();
				//������ �Ͱ� �ݴ�� close
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
