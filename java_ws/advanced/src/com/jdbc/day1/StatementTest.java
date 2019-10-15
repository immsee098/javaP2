package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		//statement �̿� - insert
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���� �Է�");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", pwd="testuser123";
			con = DriverManager.getConnection(url, user,pwd);
			System.out.println("db���� ����");
			
			//3. sql������ ó���� Statement ��ü ����
			st = con.createStatement(); //�޸� ĳ�� �Ⱦ� �Ź� �м�
			
			//4. ����
			String sql="insert into person(no, name, tel)"+
						" values(person_seq.nextval, '"+name+"', '"+tel+"')";
			int cnt = st.executeUpdate(sql);
			System.out.println(cnt+"���� �� �Է�");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(st!=null) st.close(); //�̰� null�̰� if�� ���� ������
				if(con!=null) con.close();
				//������ �Ͱ� �ݴ�� close
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
