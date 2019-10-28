package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		//Statement �̿� - insert
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ �Է�!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		Statement st=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�!");
			
			//2. db������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����!");
			
			//3. sql������ ó���� Statement��ü ����
			st=con.createStatement();
			
			//4. ����
			String sql="insert into person(no, name, tel)" + 
				" values(person_seq.nextval, '"+name+"','"+tel+"')";
			int cnt=st.executeUpdate(sql);
			System.out.println("ó���� ���� ����:"+ cnt);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
