package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest1 {

	public static void main(String[] args) {
		//execute() �޼��� �̿�
		//���̺�, sequence ����

		Connection con=null;
		PreparedStatement ps=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�!");
			
			//2. db������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", pwd="testuser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����!");
			
			//3. sql������ ó���ϱ� ���� PreparedStatement��ü ����
			//table ����
			String sql="create table pd2" + 
					"(" + 
					"    no  number primary key," + 
					"    pdname varchar2(100) not null," + 
					"    price number," + 
					"    regdate date default sysdate" + 
					")";
			ps=con.prepareStatement(sql);
			
			//4. ����
			boolean bool=ps.execute();
			//=> ��� sql���� ������ �� �ִ�
			//=> select���� ��� true�� ����, �������� false�� ����
			System.out.println("���̺� ����, bool="+bool);
			
			//sequence ����
			sql="create sequence pd2_seq" + 
					" start with 1" + 
					" increment by 1" + 
					" nocache";
			ps=con.prepareStatement(sql);
			
			bool=ps.execute();
			System.out.println("sequence����, bool="+bool);
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
