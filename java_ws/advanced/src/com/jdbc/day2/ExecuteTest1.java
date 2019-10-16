package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest1 {

	public static void main(String[] args) {
		// execute �޼��� �̿�
		//���̺�, sequence����
		
		Connection con = null;
		PreparedStatement ps = null;
		//1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�");
			
			//2. db������ ���� ���� ���ؼ�
			String url = "jdbc:oracle:thin:@DESKTOP-IA9SFNU:1521:XE";
			String user ="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����");
			
			//3. sql���� ó�� ���� preparedstatement
			//table ����
			String sql = "create table pd2\r\n" + 
					"(\r\n" + 
					"    no number primary key,\r\n" + 
					"    pdname varchar2(100) not null,\r\n" + 
					"    price number,\r\n" + 
					"    regdate date default sysdate\r\n" + 
					")";
			ps = con.prepareStatement(sql);
			
			//4.����
			boolean bool = ps.execute();
			//=>��� sql���� ���డ��
			//=>select���� ��� true, �������� false ����
			System.out.println("���̺� ����, bool="+bool);
			
			//sequence ����
			sql="create sequence pd2_seq\r\n" + 
					"start with 1\r\n" + 
					"increment by 1\r\n" + 
					"nocache";
			ps = con.prepareStatement(sql);
			
			bool = ps.execute();
			System.out.println("sequence����, bool="+bool);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) ps.close();
				if(con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
