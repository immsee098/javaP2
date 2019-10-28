package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest1 {

	public static void main(String[] args) {
		//저장 프로시저 실행
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		CallableStatement cs=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-BFLLBCO:1521:xe";
			String user="testuser", upwd="testuser123";
			con=DriverManager.getConnection(url, user, upwd);
			System.out.println("db연결 성공");
			
			//3. PreparedStatement객체 생성
			String sql="call personInsert(?,?)";
			cs=con.prepareCall(sql);
			
			//in parameter setting
			cs.setString(1, name);
			cs.setString(2, tel);
			
			//4. 실행
			boolean bool=cs.execute();
			System.out.println("저장 프로시저, bool="+bool);
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
