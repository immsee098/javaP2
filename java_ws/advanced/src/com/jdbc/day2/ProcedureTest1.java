package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest1 {

	public static void main(String[] args) {
		//���� ���ν��� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ �Է�!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		CallableStatement cs=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db���� ����");
			
			//3. PreparedStatement��ü ����
			String sql="call personInsert(?,?)";
			cs=con.prepareCall(sql);
			
			//in parameter setting
			cs.setString(1, name);
			cs.setString(2, tel);
			
			//4. ����
			boolean bool=cs.execute();
			System.out.println("���� ���ν���, bool="+bool);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
